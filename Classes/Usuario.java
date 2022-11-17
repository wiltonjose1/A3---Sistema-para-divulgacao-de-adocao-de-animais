public class Usuario {
    
    private String email;

    private String senha;
	
    private String nome;

    private String cpf;

    private String dataNascimento;
	
    private String login;
	
	
	

    public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

        public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

        public String getDataNascimeto() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getLogin() {
		return login;
        }
	
	public void setlogin(String login){
		this.login = login;
	
}
