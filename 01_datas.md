## FORMATOS DE DATAS
```
data = new Date(); //GROOVY
data = Datas.hoje() //BFC

ontem   = data.previous()
amanha  = data.next()


println(data.toOffsetDateTime())
println(data.toLocalDateTime())
println(data.toLocalTime())
println(data.toOffsetTime())

println(data.toLocalDate())
println(data.toYearMonth())
println(data.toYear())
println(data.toDayOfWeek())
println(data.toMonth())
```

## SETANDO UMA DATA PREDEFINIDA
```
aniversario = new Date(1966-1900, 8-1, 17);
aniversario2 = [1966-1900,8-1,17] as Date;
```

## USANDO MÉTODO PARSE
```
aniversario = new Date().parse(“d/M/yyyy H:m:s”, “17/8/1996 13:30:25”);
```

## MASCARAS PARA CONVERSÕES DE DATAS
```
Máscara          Significado
GG               Era, com os valores AD(Anno Domini) ou DC(Before Christ)
yy               Ano, dois digitos
yyyy             Ano, quarto digitos
MM               Mes, 01 a 12
MMM              Nome do Mes abreviado: Jan a Dez
MMMM             Nome do Mes: Janeiro a Dezembro
W                Valor da semana do mes
www              Valor da semana no ano
DD               Dia, 01 a 31
DDD              Dia do ano ou Dia Juliano: 000 a 365
EEE              Nome do Dia da Semana abreviado: Dom a Seg
EEEE             Nome do Dia da semana: Domingo a Segunda-feira
Aa               Indicador AM/PM
hh               Hora corrente(0 a 12)
HH               Hora corrente (0 a 23)
mm               Minuto corrente (0 a 59)
ss               Segundo corrente (0 a 59)
SSS              Milissegundo corrente(0 a 59)
zzz              Fuso Horario abreviado
zzzz             Fuso Horario completo
```
## BFC

https://test.betha.com.br/documentacao/bfc-script/2.7.X/index.html#datas
