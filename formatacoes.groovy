//CPF
def fDocumentoPFPJPJPJ = { (it ?: "").replaceAll(/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/, /$1.$2.$3\/$4\-$5/)
                              .replaceAll(/(\d{3})(\d{3})(\d{3})(\d{2})/, /$1.$2.$3-$4/)
                              .replaceAll(/^[0-9]{11}$/) { match -> match[0] } ?: "O CPF/CNPJ não foi preenchido corretamente." }

def formatarCPF(cpf) {
  cpf = cpf.replaceAll(/\D/, '') // Remove caracteres não numéricos
  cpf.length() == 11 ? cpf.replaceAll(/(\d{3})(\d{3})(\d{3})(\d{2})/, 'XXX.$2.$3-XX') : "CPF inválido."
}

//TELEFONE
def formatarTelefone(String telefone) {
    def apenasDigitos = telefone.replaceAll("[^\\d]", "")
    if (apenasDigitos.length() == 10) {
        return "(${apenasDigitos[0..1]}) ${apenasDigitos[2..5]}-${apenasDigitos[6..9]}"
    } else if (apenasDigitos.length() == 11) {
        return "(${apenasDigitos[0..1]}) ${apenasDigitos[2..6]}-${apenasDigitos[7..10]}"
    } else {
        return telefone
    }
}
