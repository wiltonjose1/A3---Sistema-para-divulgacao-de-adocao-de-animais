public class animal {
    public int id_animal;

    private String especie;

    private String idade;

    private String raca;

    private String endereco;

    private int telefone;

    
    public int getId_animal() {
		return id_animal;
	}

	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
    }    

    public String getNome() {
		return especie;
	}

	public void setNome(String especie) {
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
}
