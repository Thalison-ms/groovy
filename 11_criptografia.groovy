def text = "Vou converter isso para codificacao Base64!"
def encoded = text.bytes.encodeBase64().toString()
println(encoded)

byte [] decoded = encoded.decodeBase64()
println(new String(decoded))
