    public class Requisitos {

        private int idade;

        private String documentos;

        private String comprovanteResidencia;

        private boolean concordanciaFamiliar;

        private String termoDeResponsabilidade;

        public int getIdade(){
            return idade;
        }

        public void setIdade (int idade){
           this.idade += 21;
        }

        public String getDocumentos(){
            return documentos;
        }

        public void setDocumentos (String documentos){
            this.documentos = documentos;
        }

        public String getComprovanteResidencia(){
            return comprovanteResidencia;
        }

        public void setcomprovanteResidencia (String comprovanteResidencia){
            this.comprovanteResidencia = comprovanteResidencia;
        }

        public boolean isConcordanciaFamiliar (){
            return concordanciaFamiliar;
        }

        public void setConcordanciaFamiliar (boolean concordanciaFamiliar){
            this.concordanciaFamiliar = concordanciaFamiliar;
        }

        public String getTermoDeResponsabilidade(){
            return termoDeResponsabilidade;
        }

        public void setTermoDeResponsabilidade (String termoDeResponsabilidade){
            this.termoDeResponsabilidade = termoDeResponsabilidade;
        }
    }
