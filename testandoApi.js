let municipio = 'Lucas do Rio Verde - MT'
let token = '6cb2162c-e7ac-42fb-b7ad-1d4ac426cb91'
let url = 'https://educacao.betha.cloud/service-layer/v2/api/lista-espera-inscricao'
var listaJson = []

let list = []
function manipularDados(content){
    content.forEach( obj => {
        if(obj.configuracaoListaEspera.descricao == 'Inativa_0'){
            list.push(obj)
        }
    })
} 
async function buscarDados () {
    let passou = true
    let offset = 0
    let pagina = 0
    let limit = 99
    let hasNext = true
    while(hasNext){
        try {
            const response = await fetch(url, {
                method: 'GET',
                headers: {
                    'Authorization': `Bearer ${token}`,
                    'X-Offset': offset,
                    'X-Limit': limit,
                    'Filter': "id LIKE '%6340337d67e08300087e5ea4%'"
                }
            })
            const map = await response.json();
            if(map.message){
                throw new Error(map.message)
            } else {
                manipularDados(map.content)
            }
            pagina += 1
            offset = limit * pagina
            hasNext = map.hasNext
        } catch (error) {
            console.log(error)
            passou = false
        } finally {
            if(passou == false){
                console.log("Verifica a API") 
            }
        }
    }
}
(async () => {
    await buscarDados()
    console.log(list)
})()