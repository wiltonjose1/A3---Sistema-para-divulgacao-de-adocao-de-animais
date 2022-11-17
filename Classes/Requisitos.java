    public class Requisitos {

        private int idade;

        private String documentos;

        private String comprovanteResidencia;

        private boolean concordanciaFamiliar;

        public void idade (int idade){
            idade += 21;
        }

        public void documentos (String documentos){
            this.documentos = documentos;
        }

        public void comprovanteResidencia (String comprovanteResidencia){
            this.comprovanteResidencia = comprovanteResidencia;
        }

        public void concordanciaFamiliar (boolean concordanciaFamiliar){
            this.concordanciaFamiliar = concordanciaFamiliar;
        }
    }
