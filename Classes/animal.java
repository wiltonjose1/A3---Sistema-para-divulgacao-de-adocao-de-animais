public class animal {
    public int id_animal;

    private String especie;

    private String idade;

    private String raca;

    private String endereco;

    private int telefone;
	
    private boolean estahComVacinasEmDia;

    private boolean estahCastrado; 
	
    private String detalhes;

    private String cor;
	
    private String sexo;
 
    private String tamanho;


    
    public int getId_animal() {
		return id_animal;
	}

	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
    }    

    public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

    public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

    public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

    public int getTelefone() {
		return telefone;
	}

	public void setDescricao(int telefone) {
		this.telefone = telefone;
	}

    public String getEndereco() {
		return endereco;
	}

	public void setEdereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean isEstahComVacinasEmDia() {
		return estahComVacinasEmDia;
	}

	public void setEstahComVacinasEmDia(boolean estahComVacinasEmDia) {
		this.estahComVacinasEmDia = estahComVacinasEmDia;
	}
	
	public boolean isEstahCastrado() {
		return estahCastrado;
	}

	public void setEstahCastrado(boolean estahCastrado) {
		this.estahCastrado = estahCastrado;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
		
}
