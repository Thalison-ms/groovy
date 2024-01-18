Stretch With Overflow - Quebra de linha

DATASET
new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($F{historicos})


Centraliza um cabeçalho de acordo com a quantidade de itens abaixo, exemplo: Diário de Classe que possui uma data e tem várias aulas nessa data.
<columnGroup name="data" height="22" totalPosition="End" headerPosition="Stretch">



"(" + VALOR_POR_EXTENSO($F{totalGeralEmpenho}) + ")"


new java.text.SimpleDateFormat(“dd/MM/yyyy”).format($F{DATA})
new SimpleDateFormat("dd/MM/yyyy").format($V{dataAula})                                 Formatar data TIBICO
new SimpleDateFormat("yyyy-MM-dd").parse($P{data}.toString())
DATEFORMAT(EQUALS($P{dtDocumento},null)?NOW():new SimpleDateFormat("yyyy-MM-dd").parse($P{dtDocumento}.toString()),"dd 'de' MMMM 'de' yyy")

//==============================================================PIECHART COM KEY DUPLICADA, COLOCA NO TOPO, ABAIXO DO JASPERREPORT XMLNS
<property name="net.sf.jasperreports.chart.pie.ignore.duplicated.key" value="true"/>
//==============================================================LISTAR A ULTIMA INFORMAÇÃO NO PIECHART
Abra o PIECHART e no campo Reset on defina o cabeçalho, então será listado a ultima informação do cabeçalho, que no caso, seria a ultima soma
//==============================================================FORMATAR CPF/CNPJ
( $F{cpfCnpjContrato}.length() == 14 ) ? 
$F{cpfCnpjContrato}.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5")  : 
$F{cpfCnpjContrato}.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4")
//==============================================================APRESENTA PÁGINA PERSONALIZADA CASO NENHUMA INFORMAÇÃO SEJA ENVIADA AO JASPER
cria uma band para No Data
No Report raiz vai nas propriedades e marca No Data Section na opção When No Data Type
//==============================================================MOSTRA DATA DE HOJE COM NOME DO MUNICÍPIO
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL LUCAS DO RIO VERDE")? "Lucas do Rio Verde, " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS":
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE CANARANA")? "Canarana, " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS":
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE APIACAS")? "Apiacas, " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS":
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE PLANALTO DA SERRA")? "Planalto da Serra, " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS":
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL ITIQUIRA")? "Itiquira, " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS": "Emitido em " + (new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(new java.util.Date())) + " - " +
"Betha Sistemas/STAF SISTEMAS"
//==============================================================CABEÇALHO PRO NOME DA SECRETARIA
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL LUCAS DO RIO VERDE") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO" : 
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE CANARANA") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO E CULTURA" : 
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL ITIQUIRA") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO" :
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE PLANALTO DA SERRA") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO, ESPORTE E LAZER" :
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE MIRASSOL D OESTE") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO, ESPORTE, LAZER E CULTURA" : 
$P{ENTIDADE_NOME}.toUpperCase().equals("PREFEITURA MUNICIPAL DE APIACAS") ? "SECRETARIA MUNICIPAL DE EDUCAÇÃO" : ""
