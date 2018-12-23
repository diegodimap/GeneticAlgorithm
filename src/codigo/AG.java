package codigo;

import java.util.Random;
import javax.swing.JOptionPane;

public class AG {
	
	private int POPULACAO = 50;
	private int TAMANHO_CROMOSSOMO = 16;
	private int CODIGO = 2;
	private int INICIO = -12;
	private int FIM = 12;
	private int GERACOES = 50;
	private int contadorGeracoes = 0;
	private int melhorIndividuo = 0;
	private double melhor = 0;
	private int SEMENTE = 2;
	private double PRECISAO = 0.001;
	private int VEZES = 5;
	private double ADs[];
	private double ADRs[];
	private double NCEs[];
	private double VDs[];
	private double Decimais[];
	private int populacao[][];
	private int geracoes[][];
	private Random aleatorio = new Random();
	private double SOMA_ADR[];
	private double RECOMBINACAO = 0;
	private double MUTACAO = 0;
	private double INVERSAO = 0;
	private double ROTACAO = 0;
	private double MAIOR_ADR = 0;
	private double MAIOR_AD = 0;
	
    public AG(int popu, int gera, int vezes, double recombinacao, double inversao,
            double rotacao, double mutacao) {
        
        POPULACAO = popu;
        GERACOES = gera;
        VEZES = vezes;
        RECOMBINACAO = recombinacao;
        INVERSAO = inversao;
        MUTACAO = mutacao;
        ROTACAO = rotacao;
        
    	populacao = new int[POPULACAO][TAMANHO_CROMOSSOMO];
    	ADs = new double[POPULACAO];
    	ADRs = new double[POPULACAO];
    	NCEs = new double[POPULACAO];
    	VDs = new double[POPULACAO];
    	Decimais = new double[POPULACAO];
    	SOMA_ADR = new double[POPULACAO];
    	geracoes = new int[POPULACAO][TAMANHO_CROMOSSOMO];
    	
    	inicializaPopulacao();
    	calculaTodosDecimais();
    	calculaTodosVDs();
    	calculaTodosADs();
    	calculaTodosNCEs();
    	calculaTodosADRs();
    	
    	//mostraValores();
    	calculaLimitesADR();
    	reproducao();
     }
    
    public void inicializaPopulacao(){
    	for(int i=0; i<POPULACAO; i++){
    		for(int j=0; j<TAMANHO_CROMOSSOMO; j++){
    			populacao[i][j] = geraGene();
    		}
    	}
    }
    
    public int geraGene(){
    	return aleatorio.nextInt(SEMENTE);
    }
    
    public String getCromossomo(int posicaoPopulacao){
    	String cromossomo = "";
    	for(int i=0; i<TAMANHO_CROMOSSOMO; i++)
    		cromossomo += String.format("%d", populacao[posicaoPopulacao][i]);
    		
    	return cromossomo;
    }
    
    public double funcaoTrabalho(double valorDeX){
    	double resultado1 = 0;
    	double resultado2 = 0;
    	double resultadoFinal = 0;
    	double x = valorDeX;
    	
    	resultado1 = -Math.pow(x, 4) + (5*Math.pow(x, 3)) - (17*Math.pow(x, 2)) + x + 4000;
    	
    	resultado2 = Math.sin(1.7*x - 200)*Math.exp(x/250);
    	
    	return Math.abs((resultado1*resultado2) + 5997);
    }
    
    public void calculaTodosDecimais(){
    	for(int i=0; i<POPULACAO; i++){
    		Decimais[i] = calculaDecimal(i);
    	}
    }
    
    public void calculaTodosVDs(){
    	for(int i=0; i<POPULACAO; i++){
    		VDs[i] = calculaVD(Decimais[i]);
    	}
    }
    
    public void calculaTodosADs(){
    	for(int i=0; i<POPULACAO; i++){
    		ADs[i] = calculaAD(VDs[i]);
    	}
    }
    
    public void calculaTodosNCEs(){
    	for(int i=0; i<POPULACAO; i++){
    		NCEs[i] = calculaNCE(ADs[i]);
    	}
    }
    
    public void calculaTodosADRs(){
    	for(int i=0; i<POPULACAO; i++){
    		ADRs[i] = calculaADR(ADs[i]);
    	}
    }
    
    public void calculaLimitesADR(){
    	double total = 0;
    	
    	for(int i=0; i<POPULACAO; i++){
    		total = 0;
    		for(int j=0; j<=i; j++){
    			total += ADRs[j];
    		}
    		SOMA_ADR[i] = total;
    	}
    }
    
    public double calculaVD(double cromossomo){    	
    	double VD = INICIO + (FIM - INICIO) * cromossomo/calculaVDS();
    	
    	return VD;
    }
    
    public double calculaAD(double VD){
    	double AD = 1/funcaoTrabalho(VD); //É A INVERSA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   	
    	return AD;
    }
    
    public double somatorioAD(){
    	double total = 0;
    	for(int i=0; i<POPULACAO; i++){
    		total += ADs[i];
    	}
    	
    	return total;
    }
    
    public int melhorAD(){
    	int maiorI = 0;
    	for(int i=0; i<POPULACAO; i++){
    		if(ADs[i] > MAIOR_AD) MAIOR_AD = ADs[i];
    	}
    	for(int i=0; i<POPULACAO; i++){
    		if(ADs[i] == MAIOR_AD) maiorI = i;
    	}
    	
    	return maiorI;
    }
    
    public double calculaNCE(double AD){
    	double NCE = (double)AD/somatorioAD()/(FIM-INICIO);
    	
    	return NCE;
    }
    
    public double somatorioNCE(){
    	double total = 0;
    	for(int i=0; i<POPULACAO; i++){
    		total += NCEs[i];
    	}
    	
    	return total;
    }
    
    public double calculaADR(double AD){
    	double ADR = (double)AD/somatorioAD();
    	
    	return ADR;
    }
    
    public double somatorioADR(){
    	double total = 0;
    	for(int i=0; i<POPULACAO; i++){
    		total += ADRs[i];
    	}
    	
    	return total;
    }
    
    public double calculaDecimal(int cromossomo){
    	int expoente = TAMANHO_CROMOSSOMO - 1;
    	int total = 0;
    	
    	for(int i=0; i<TAMANHO_CROMOSSOMO; i++){
    		total += populacao[cromossomo][i]*Math.pow(CODIGO, expoente--);
    	}
    	
    	return total;
    }
    
    public int calculaVDS(){
    	int expoente = TAMANHO_CROMOSSOMO - 1;
    	int VDS = 0;
    	
    	for(int i=0; i<TAMANHO_CROMOSSOMO; i++){
    		VDS += Math.pow(CODIGO, expoente--);
    	}
    	
    	return VDS;
    }
    
    public int calculaTamanhoCromossomo(int i, int f, double p){
    	int inicio = i;
    	int fim = f;
    	double precisao = p;
    	double resultado = Math.log(1 + (fim-inicio)/precisao) / Math.log(2);
        int comprimento = (int)resultado;
    	return 1 + comprimento;
    }
    
    public void criteriosDeParada(){
    	if(contadorGeracoes == 0){
    		melhor = VDs[melhorAD()];
    	}
    	else if(VDs[melhorAD()] == melhor){
    		melhorIndividuo++;
    	}else{
    		melhorIndividuo = 0;
    		melhor = VDs[melhorAD()];
    	}
    	
    	if(melhorIndividuo == VEZES){
    		String message = String.format("Melhor indivíduo por %d gerações é: %.3f", VEZES, melhor);
    		JOptionPane.showMessageDialog(null, message, "FIM DO APLICATIVO", JOptionPane.WARNING_MESSAGE);
    		System.exit(0);
    	}
    }
    
    public int selecao(){
    	double seleciona = aleatorio.nextDouble();
    	int melhorADR = selecionaMelhorADR(aleatorio.nextDouble());
    	int melhorADR2 = selecionaMelhorADR(aleatorio.nextDouble());
    	int retorno = 0;
    	
    	seleciona*=100;
    	   	
    	if(seleciona <= RECOMBINACAO){
    	//	System.out.println("Recombinacao, de 0 a " + RECOMBINACAO);
    		retorno = recombinacao(melhorADR, melhorADR2);
    	}
    	if((seleciona <= (RECOMBINACAO+MUTACAO))&&(seleciona > RECOMBINACAO)){
    	//	System.out.printf("Mutacao, de %.2f a %.2f \n", RECOMBINACAO, RECOMBINACAO+MUTACAO);
    		retorno = mutacao(melhorADR);
    	}
    	if((seleciona <= (RECOMBINACAO+MUTACAO+INVERSAO))&&(seleciona > RECOMBINACAO+MUTACAO)){
    	//	System.out.printf("Inversao, de %.2f a %.2f \n", RECOMBINACAO+MUTACAO, RECOMBINACAO+MUTACAO+INVERSAO);
    		retorno = inversao(melhorADR);
    	}
    	if(seleciona > (RECOMBINACAO+MUTACAO+INVERSAO)){
    	//	System.out.printf("Rotacao, de %.2f a %.2f \n", RECOMBINACAO+MUTACAO+INVERSAO, 100.00);
    		retorno = rotacao(melhorADR);
    	}
    	
    	//System.out.printf("Aleatorio gerado: %.2f \n", seleciona);
    	
    	return retorno;
    }
    
    public int selecionaMelhorADR(double porcentagem){
    	int i = 0;
    	for(i=0 ; i<POPULACAO; i++){
    		if(porcentagem < SOMA_ADR[i]) break;
    	}
    	
    	return i;
    }
    
    public int recombinacao(int adr, int adr2){
    	int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int maior = 0;
    	int menor = 15;
    	
    	if(maior < P1) maior = P1;
    	if(maior < P2) maior = P2;
    	if(menor > P1) menor = P1;
    	if(menor > P2) menor = P2;
    	
    	int temp[] = new int[TAMANHO_CROMOSSOMO];
    	
    	for(int i = menor; i <= maior; i++){
    		temp[i] = populacao[adr][i];
    	}
    	
    	for(int i = menor; i <= maior; i++){
    		populacao[adr][i] = populacao[adr2][i];
    	}
    	
    	for(int i = menor; i <= maior; i++){
    		populacao[adr2][i] = temp[i];
    	}
    	
    	int retorno = 0;
    	if(calculaDecimal(adr) > calculaDecimal(adr2)){
    		retorno = adr;
    	}else{
    		retorno = adr2;
    	}
    	
    	return retorno;
    }
    
    public int mutacao(int adr){
    	int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	
    	if(populacao[adr][P1] == 1) populacao[adr][P1] = 0;
    	else if(populacao[adr][P1] == 0) populacao[adr][P1] = 1;
    	
    	return adr;
    }
    
    public int inversao(int adr){
    	int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int maior = 0;
    	int menor = 15;
    	
    	if(maior < P1) maior = P1;
    	if(maior < P2) maior = P2;
    	if(menor > P1) menor = P1;
    	if(menor > P2) menor = P2;
    	
    	int temp[] = new int[TAMANHO_CROMOSSOMO];
    	
    	for(int i=menor; i<=maior; i++){
    		temp[i] = populacao[adr][i];
    	}
    	
    	int inversor = maior;
    	for(int j=menor; j<=maior; j++){
    		populacao[adr][j] = temp[inversor--];
    	}
    
    	return adr;	
    }
    
    public int rotacao(int adr){
    	int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO-1);
    	int maior = 0;
    	int menor = 15;
    	
    	if(maior < P1) maior = P1;
    	if(maior < P2) maior = P2;
    	if(menor > P1) menor = P1;
    	if(menor > P2) menor = P2;
    	
    	if(menor == 0) menor++;
    	
    	int temp[] = new int[TAMANHO_CROMOSSOMO];
    	
    	for(int j=menor; j<=maior; j++){
    		temp[j] = populacao[adr][j];
    	}
    	
    	for(int j=menor; j<=maior; j++){
    		populacao[adr][j] = temp[j-1];
    	}
    	
    	populacao[adr][menor] = temp[maior];
    	
    	return adr;
    }
    
    public void reproducao(){
    	int retorno = 0;
    	
    	for(int i=0; i<GERACOES; i++){
    		criteriosDeParada();
    		populacaoParaGeracao(0, melhorAD());
    		
    		for(int j=1; j<POPULACAO; j++){
    			retorno = selecao();
    			populacaoParaGeracao(j, retorno);
    		}
    		preenchePopulacaoComGeracao();
    		calculaTodosDecimais();
    		calculaTodosVDs();
    		calculaTodosADs();
    		calculaTodosNCEs();
    		calculaTodosADRs();
    		calculaLimitesADR();
    		System.out.println("GERACAO: " + ++contadorGeracoes);
    		mostraValores();
    		
    		if(contadorGeracoes == GERACOES){
    			System.out.println("GERACAO MAXIMA!!!");
    		}
    	}
    }
    
    public void preenchePopulacaoComGeracao(){
    	for(int i=0; i<POPULACAO; i++){
    		for(int j=0; j<TAMANHO_CROMOSSOMO; j++){
    			populacao[i][j] = geracoes[i][j];	
    		}
    	}
    }
    
    public void populacaoParaGeracao(int antigo, int novo){
    	for(int i=0; i<TAMANHO_CROMOSSOMO; i++){
    		geracoes[antigo][i] = populacao[novo][i];
    	}
    }
   
    public void mostraValores(){
    	for(int i = 0; i<POPULACAO; i++){
    		String str1 = String.format("Cromossomo %-3d %s %-5s %s %-5.0f %-5s %-7.3f", (i+1), ": ", getCromossomo(i), " Decimal: ", calculaDecimal(i),
    		" VD: ", VDs[i]);
    		
    		String str2 = String.format("%3s %-10.3f %3s %-4.3f %3s %-4.5f \n", " AD: ", ADs[i], " ADR: ", ADRs[i], " NCE: ", NCEs[i]);
    		
    		System.out.printf("%s %s", str1, str2);
    }
    	
    	System.out.println();    	
    	//System.out.printf("SOMATORIO ADs : %4.5f \n", somatorioAD());
    	//System.out.printf("SOMATORIO ADRs: %4.5f \n", somatorioADR());
    	//System.out.printf("SOMATORIO NCEs: %4.5f \n", somatorioNCE());
    }
}