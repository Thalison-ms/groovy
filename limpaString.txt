def limpaString = { str ->
  str = str.replaceAll("[ÂÀÁÄÃ]","A")
  str = str.replaceAll("[âãàáä]","a")
  str = str.replaceAll("[ÊÈÉË]","E")
  str = str.replaceAll("[êêèéë]","e")
  str = str.replaceAll("[ÎÍÌÏ]","I")
  str = str.replaceAll("[îíìï]","i")
  str = str.replaceAll("[ÔÕÒÓÖ]","O")
  str = str.replaceAll("[ôõòóóö]","o")
  str = str.replaceAll("[ÛÙÚÜ]","U")
  str = str.replaceAll("[ûúùü]","u")
  str = str.replaceAll("[Ç]","C")
  str = str.replaceAll("[ç]","c")
  str = str.replaceAll("[ýÿ]","y")
  str = str.replaceAll("[Ý]","Y")
  str = str.replaceAll("[ñ]","n")
  str = str.replaceAll("[Ñ]","N")
  
  return str
}
