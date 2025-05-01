    // Função para mostrar categorias principais
    function mostrarCategoria(categoriaId) {
        document.querySelectorAll('.tab-btn').forEach(btn => btn.classList.remove('active'));
        document.querySelectorAll('.ofertas-section').forEach(sec => sec.classList.remove('active'));

        document.querySelector(`#${categoriaId}`).classList.add('active');
        event.currentTarget.classList.add('active');
    }

    document.addEventListener('DOMContentLoaded', () => {
        const produtos = {
            bebidas: [
                { nome: 'Vodka', preco: '45,90', img: 'https://cdn.pixabay.com/photo/2018/06/16/05/55/alcohol-3478220_1280.jpg' },
                { nome: 'Gin', preco: '39,99', img: 'https://cdn.pixabay.com/photo/2017/05/10/08/05/gin-2300126_960_720.png' },
                { nome: 'Cachaça', preco: '18,50', img: 'https://carrefourbrfood.vtexassets.com/arquivos/ids/10980443/9393719541790.jpg?v=637417913757100000' },
                { nome: 'Whisky', preco: '89,90', img: 'https://cdn.pixabay.com/photo/2017/04/21/22/48/alcohol-2250175_1280.jpg' },
                { nome: 'Rum', preco: '25,50', img: 'https://cdn.pixabay.com/photo/2019/09/04/21/21/rum-4452606_1280.jpg' },
                { nome: 'Vinho Tinto', preco: '34,90', img: 'https://www.vinicolacampestre.com.br/wp-content/uploads/2022/08/Bordo-Suave-750ml.png' },
                { nome: 'Vinho Branco', preco: '49,90', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM1B9y65UeEYzhmNlUvP3RMYkQ4-lh8phKSA&s' },
                { nome: 'Espumante', preco: '29,90', img: 'https://casalisboa.com.br/wp-content/uploads/2020/05/Champanhe-Taittinger-Brut-750Ml-616x1024.jpg' },
                { nome: 'Cerveja', preco: '59,90', img: 'https://carrefourbrfood.vtexassets.com/arquivos/ids/23256934/cerveja-heineken-garrafa-600-ml-1.jpg?v=637655997827630000' },
                { nome: 'Licor', preco: '30,90', img: 'https://m.media-amazon.com/images/I/51hEYrZ90YL.jpg' },
                { nome: 'Água', preco: '2,50', img: 'https://adegabomretiro.com.br/wp-content/uploads/2019/10/R-199-H2O-500ML-20180618164704-700x850-1.jpg' },
                { nome: 'Água com gás', preco: '4,00', img: 'https://carrefourbrfood.vtexassets.com/arquivos/ids/18904682/agua-mineral-com-gas-crystal-500ml-1.jpg?v=637590231096200000' },
                { nome: 'Suco de Laranja', preco: '5,50', img: 'https://muffatosupermercados.vtexassets.com/arquivos/ids/370747/7898953148169-1.jpg?v=638319546135130000' },
                { nome: 'Suco de Uva', preco: '3,75', img: 'https://tb1304.vtexassets.com/arquivos/ids/198822/Suco-prats-uva-300ML.jpg?v=638210500427970000' },
                { nome: 'Suco de Maracujá', preco: '4,80', img: 'https://www.imigrantesbebidas.com.br/bebida/images/products/full/3145-suco-de-maracuja-integral-concentrado-maguary-500ml.jpg' },
                { nome: 'Coca Cola', preco: '6,50', img: 'data:image/jpeg;base64,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' },
                { nome: 'Guaraná', preco: '8,90', img: 'https://mercantilnovaera.vtexassets.com/arquivos/ids/195391-800-450?v=637793372884230000&width=800&height=450&aspect=true' },
                { nome: 'Soda', preco: '6,50', img: 'https://io.convertiez.com.br/m/trimais/shop/products/images/1617/medium/refrigerante-antarctica-soda-limao-zero-2l_1604.jpg' },
                { nome: 'Energético', preco: '7,20', img: 'https://mercantilnovaera.vtexassets.com/arquivos/ids/213168/Energetico-Original-BALY-Garrafa-2L.jpg?v=638391939994600000' },
                { nome: 'Chá gelado', preco: '5,90', img: 'https://promofarma.vtexassets.com/arquivos/ids/166088-800-450?v=637952065050370000&width=800&height=450&aspect=true' },
            ],
                hortifruti: [
                    {nome: 'Maçãs Frescas', preco: '4,99/kg', img: 'https://cdn.pixabay.com/photo/2016/09/29/08/33/apple-1702316_960_720.jpg'},
                    {nome: 'Banana Prata', preco: '2,99/kg', img: 'https://cdn.pixabay.com/photo/2018/09/24/20/12/bananas-3700718_1280.jpg'},
                    {nome: 'Laranja', preco: '5,99/kg', img: 'https://cdn.pixabay.com/photo/2023/08/16/10/09/oranges-8193789_960_720.jpg'},
                    {nome: 'Morango', preco: '15,45/kg', img: 'https://cdn.pixabay.com/photo/2022/05/27/10/35/strawberry-7224875_960_720.jpg' },
                    {nome: 'Melão', preco: '9,49/kg', img: 'https://cdn.pixabay.com/photo/2021/04/19/11/06/melon-6191135_960_720.jpg' },
                    {nome: 'Inhame', preco: '5,45/kg', img: 'https://cdn.pixabay.com/photo/2016/07/30/16/15/yams-1557440_1280.jpg' },
                    {nome: 'Cebola', preco: '12,49/kg', img: 'https://cdn.pixabay.com/photo/2016/01/17/09/37/onion-1144620_960_720.jpg' },
                    {nome: 'Pepino', preco: '7,49/kg', img: 'https://cdn.pixabay.com/photo/2019/12/04/15/44/cucumber-4672972_960_720.jpg' },
                    {nome: 'Coco', preco: '11,29/kg', img: 'https://cdn.pixabay.com/photo/2016/07/06/20/56/coconut-1501334_1280.jpg' },
                    {nome: 'Tangerina', preco: '9,49/kg', img: 'https://cdn.pixabay.com/photo/2014/08/27/18/30/minneola-429383_1280.jpg' },
                    {nome: 'Alho', preco: '21,99/kg', img: 'https://cdn.pixabay.com/photo/2016/03/05/19/14/garlic-1238337_960_720.jpg'}
                ],
                carnes: [
                        {nome: 'Lombo', preco: '25,90/kg', img: 'https://www.arenaatacado.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw684344c4/Produtos/21504-0000000002150-lombo%20suino%20granel%20kg-acougue-1.jpg'},
                        {nome: 'Pernil', preco: '22,50/kg', img: 'https://comper.vteximg.com.br/arquivos/ids/182342-1000-1000/1535528-pernil-suino.jpg?v=637485967666200000'},
                        {nome: 'Barriga', preco: '18,75/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOC3A4cN2eS7oyZ93SJJp1SI9zBpqlvO0EGA&s '},
                        {nome: 'Linguiça', preco: '15,99/kg', img: 'https://shoppingdostemperos.com.br/wp-content/uploads/2019/08/D_NQ_NP_976498-MLB26565140359_122017-O.jpeg'},
                        {nome: 'Bacon', preco: '30,00/kg', img: 'https://www.naturaldaterra.com.br/_next/image?url=https%3A%2F%2Fnaturalterra.vtexassets.com%2Farquivos%2Fids%2F165628%2FBacon-Pedaco-A-Granel-Nobre.jpg%3Fv%3D638671094106670000&w=1440&q=75'},
                        {nome: 'Bisteca', preco: '19,90/kg', img: 'https://maiscarnesuina.com.br/wp-content/uploads/2015/09/Bistequinha-Suina-redux.jpg'},
                        {nome: 'Joelho de porco', preco: '16,50/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWwGWoyUSICe03cojus-OE_3aAnYT4g8vXwQ&s'},
                        {nome: 'Costelinha', preco: '24,75/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRP3bg6y7NVj8kt69kXQQpYAls8ut0ivb2jCw&s'},
                        {nome: 'Calabresa', preco: '17,80/kg', img: 'https://bfalimentos.com/wp-content/uploads/2020/04/linguica-calabresa.jpg'},
                        {nome: 'Linguiça fina', preco: '14,95/kg', img: 'https://superprix.vteximg.com.br/arquivos/ids/177659/Linguica-Fina-Defumada-Perdigao-300g.jpg?v=636668943333530000'},
                        {nome: 'Peito', preco: '12,90/kg', img: 'https://swiftbr.vteximg.com.br/arquivos/ids/201731-768-768/617520-file-de-peito-do-campo_1.jpg?v=638664992719730000'},
                        {nome: 'Asinha', preco: '8,50/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTt-evYjfi9TgNzkGyry8lajlDIfJFuJ-wxlw&s'},
                        {nome: 'Coxa', preco: '9,75/kg', img: 'https://www.arenaatacado.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw51be79ac/Produtos/601454-0000000019996-coxa%20solteira%20de%20frango%20granel%20kg-acougue-2.jpg'},
                        {nome: 'Pescoço', preco: '5,99/kg', img: 'https://coopsp.vtexassets.com/arquivos/ids/229978-800-auto?v=638090449719830000&width=800&height=auto&aspect=true'},
                        {nome: 'Coração', preco: '7,50/kg', img: 'https://www.arenaatacado.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw15ca7865/Produtos/15702-0000000004087-coracao%20de%20frango%20bandeja%20kg-acougue-1.jpg'},
                        {nome: 'Linguiça de frango', preco: '10,90/kg', img: 'https://i1.wp.com/www.cofril.com.br/wp-content/uploads/2013/09/2014-07-22_Embala-11-Frango-Churrasco_001-Editar-60081.jpg?fit=800%2C800&ssl=1'},
                        {nome: 'Sobrecoxa', preco: '11,25/kg', img: 'https://www.svicente.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw58ffe0f2/Produtos/27529-0000000002752-sobrecoxa%20de%20frango%20resfriada%20a%20granel%20kg-acougue-1.jpg'},
                        {nome: 'Moela', preco: '6,80/kg', img: 'https://www.arenaatacado.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw0bdc61ed/Produtos/20346-0000000002034-moela%20de%20frango%20kg-acougue-1.jpg'},
                        {nome: 'Frango inteiro', preco: '20,00/un', img: 'https://images.tcdn.com.br/img/img_prod/1321487/frango_inteiro_159_1_1b3e34a83c0e3f62cd5710c721dd2ce2.png'},
                        {nome: 'Fígado', preco: '4,95/kg', img: 'https://www.svicente.com.br/on/demandware.static/-/Sites-storefront-catalog-sv/default/dw3fc945ff/Produtos/20214-0000000002021-figado%20bovino%20bandeja%20kg-acougue-1.jpg'},
                        {nome: 'Alcatra', preco: '45,90/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV1kDR2T_vBwWi--lYctK5jyARy3vUX0A4Sw&s'},
                        {nome: 'Picanha', preco: '89,90/kg', img: 'https://redemix.vteximg.com.br/arquivos/ids/221020-1000-1000/picanha-fresca-644da1b95ddc6.png?v=638683934671200000'},
                        {nome: 'Maminha', preco: '65,75/kg', img: 'https://institucional.carapretaoficial.com.br/wp-content/uploads/2020/04/Cortes-Sem-Fundo-FullHD-Maminha-1.png'},
                        {nome: 'Fraldinha', preco: '55,00/kg', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1do7MwUxyfTCf9W2smaeftgufNgeNIDNXlg&s'},
                        {nome: 'Cupim', preco: '70,50/kg', img: 'https://www.davo.com.br/ccstore/v1/images/?source=/file/v2516139848162315495/products/prod_2756.imagem1.jpg&height=940&width=940'},
                        {nome: 'Costela', preco: '60,00/kg', img: 'https://prezunic.vtexassets.com/arquivos/ids/181018/65678ac01ef3739680761694.jpg?v=638368813479170000'},
                        {nome: 'Patinho', preco: '40,25/kg', img: 'https://boa.vtexassets.com/unsafe/fit-in/720x720/center/middle/https%3A%2F%2Fboa.vtexassets.com%2Farquivos%2Fids%2F584419%2FCarne-Bovina-Patinho-Pedaco-kg.jpg%3Fv%3D638618352208270000'},
                        {nome: 'Filé mignon', preco: '120,00/kg', img: 'https://wessel.com.br/cdn/shop/products/FileMignon-rosbife_innaturaV3.jpg?v=1589062457'},
                        {nome: 'Músculo', preco: '35,90/kg', img: 'https://bigdelivery-assets-sales-production.s3-sa-east-1.amazonaws.com/spree/images/1072/large/237_-_Musculo_%281_de_1%29.jpg?1508924905'},
                        {nome: 'ContraFilé', preco: '58,75/kg', img: 'https://superprix.vteximg.com.br/arquivos/ids/177733-600-600/Contra-File-Bovino-500g.png?v=636676942428530000'},
                    ],
                padaria: [
                { nome: "Pão francês", preco: "0.80/un", img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-QFhtABKHltX3JHLn2Swbawc4xhYv6_vJLg&s' },
                { nome: "Pão de forma", preco: "6.50/un", img: 'https://www.davo.com.br/ccstore/v1/images/?source=/file/v6927418914476199480/products/prod_7891203010056.imagem1.jpg&height=940&width=940' },
                { nome: "Pão integral", preco: "7.00/un", img: 'https://superprix.vteximg.com.br/arquivos/ids/182349/816124.jpg?v=637122110583200000' },
                { nome: "Pão doce", preco: "2.50/un", img: 'https://claudia.abril.com.br/wp-content/uploads/2020/02/receita-pao-doce-de-creme-e-coco.jpg?quality=70&strip=info' },
                { nome: "Pão de queijo", preco: "1.20/un", img: 'https://amopaocaseiro.com.br/wp-content/uploads/2022/08/yt-069_pao-de-queijo_receita-840x560.jpg' },
                { nome: "Pão de milho", preco: "1.80/un", img: 'https://receitadaboa.com.br/wp-content/uploads/2024/08/Imagem-ilustrativa-de-pao-de-milho.webp' },
                { nome: "Bolo de chocolate", preco: "18.00/un", img: 'https://www.receiteria.com.br/wp-content/uploads/bolo-de-chocolate-de-liquidificador-capa.png' },
                { nome: "Bolo de cenoura", preco: "16.00/un", img: 'https://bolosparavender.com/wp-content/uploads/2019/11/bolo-de-cenoura-cremoso-com-leite-condensado.jpg' },
                { nome: "Bolo de fubá", preco: "15.00/un", img: 'https://s2-receitas.glbimg.com/GDADinKyW8a4LTtwZyXlG1OiP_E=/0x0:1280x800/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_1f540e0b94d8437dbbc39d567a1dee68/internal_photos/bs/2022/w/I/HzhyCkTqm1UoDynv8XDQ/bolo-de-fuba-fofino.jpg' },
                { nome: "Sonho recheado", preco: "4.50/un", img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYI9Kw9bCx1IoH4aBqF-fozWd8rFwtCMh58w&s' },
                { nome: "Torta de morango", preco: "25.00/un", img: 'https://www.receitasnestle.com.br/sites/default/files/srh_recipes/efbe0e7c5f30121a83f2565fc97e0b07.jpg' },
                { nome: "Croissant de chocolate", preco: "5.00/un", img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDVe754Fb3cJ4rSn9hs0rls4YdZ-g1hlajuA&s' },
                { nome: "Coxinha", preco: "3.50/un", img: 'https://receitatodahora.com.br/wp-content/uploads/2025/01/coxinha-de-mandioca-0601.jpg' },
                { nome: "Esfirra", preco: "2.40/un", img: 'https://canaldareceita.com.br/wp-content/uploads/2024/09/ESFIHA-DE-CARNE-FECHADA.jpg' },
                { nome: "Enroladinho de salsicha", preco: "2.90/un", img: 'https://receitatodahora.com.br/wp-content/uploads/2023/11/enroladinho-de-salsicha-07-11.jpg' },
                { nome: "Pastel de queijo", preco: "4.50/un", img: 'https://minhasreceitinhas.com.br/wp-content/uploads/2023/05/pastel-de-feira-de-queijo.jpg' },
                { nome: "Quibe", preco: "2.80/un", img: 'https://guiadacozinha.com.br/wp-content/uploads/2016/12/receitademiniquibe.jpg' },
                { nome: "Empada de frango", preco: "5.90/un", img: 'https://static.itdg.com.br/images/1200-630/4b5235592ca4303a2cafa984d1813fa9/127094-original.jpg' },
            ],
            frios: [
                { nome: 'Presunto', preco: '4,00/100g', img: 'https://hortifrutibr.vtexassets.com/arquivos/ids/161207/Presunto-Cozido-Fatiado-Seara.jpg?v=638671093803330000' },
                { nome: 'Mussarela', preco: '13,00/250g', img: 'https://carrefourbrfood.vtexassets.com/arquivos/ids/22867100/149225_1.jpg?v=637648246301900000' },
                { nome: 'Queijo Prato', preco: '30,00/450g', img: 'https://images.tcdn.com.br/img/img_prod/1049139/queijo_prato_fatiado_150g_d_or_603_1_d9a6770e63d8bc4319f8a61771adfb1d.jpg' },
                { nome: 'Salame', preco: '40,00/300g', img: 'https://bdoze.com.br/wp-content/uploads/2023/01/Salame-Italiano-Milano-Hamburgues-e-pepperoni_conheca-as-diferencas.jpg' },
                { nome: 'Peito de Peru', preco: '17,00/250g', img: 'https://s2-ge.glbimg.com/aujJ1OlgsjVZiHktOAeFJjfCpKg=/0x0:1254x836/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2024/H/1/JAOBbORGGr7hDjtqU2cg/peito-de-peru.jpg' },
                { nome: 'Queijo Gouda', preco: '17,00/170g', img: 'https://acdn-us.mitiendanube.com/stores/001/578/204/products/tempimagehtpc1r1-20c472cd3896bcc28f16209124939731-480-0.jpg' },
                { nome: 'Copa', preco: '99,00/300g', img: 'https://queijocomprosa.com.br/wp-content/uploads/2021/06/copa-fatiada.jpg.webp' },
                { nome: 'Queijo Provolone', preco: '50,00/500g', img: 'https://images.tcdn.com.br/img/img_prod/1049139/provolone_maturado_defumado_aprox_5_2kg_yema_1063_2_b14f71558f5db6859fd525c907188012.jpg' },
                { nome: 'Mortadela', preco: '40,00/kg', img: 'https://phygital-files.mercafacil.com/armazem-maria/uploads/produto/mortadela_perdig_o_bolonha_ouro_fatiada_kg_6599d02b-4f39-4e34-ae73-471a7434a75e.png' },
                { nome: 'Blanquet de Peru', preco: '7,00/100g', img: 'https://obahortifruti.vtexassets.com/arquivos/ids/5969837/Blanquet-De-Peru-Sadia-Fatiado-Kg.png?v=638424103020000000' },
                { nome: 'Queijo Suíço', preco: '20,00/110g', img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiUy3ssnQKfxBKGykkB2sF9aqr1-V8eR6LjA&s' },
                { nome: 'Lombo Canadense', preco: '15,00/200g', img: 'https://zonasul.vtexassets.com/arquivos/ids/3074463/VF4qT-qqCUAAAAAAAANdKQ.jpg?v=637859990210200000' },
                { nome: 'Pastrami', preco: '280,00/kg', img: 'https://static.itdg.com.br/images/auto-auto/cbe7ed2c79c3ab742f807adc575def62/pastrami2.jpg' },
                { nome: 'Queijo Brie', preco: '35,00/unidade', img: 'https://www.produtosfinos.com.br/wp-content/uploads/2015/12/10_curiosidades_sobre_o_queijo_brie.png' },
            ],
        };
        function criarProdutoCard(produto) {
            const card = document.createElement('div');
            card.className = 'produto-card';
            card.innerHTML = `
                 <div class="produto-card">
                <h3>${produto.nome}</h3>
                <div class="imagem-promocao">
                    <img src="${produto.img}">
                </div>
                <p class="produto-preco">R$ ${produto.preco}</p>
                <button class="botao-comprar">Adicionar ao Carrinho</button>
            </div>
            `;
            return card;
        }
        function carregarProdutos() {
            // Hortifruti
            const gridHortifruti = document.querySelector('#hortifruti .produtos-grid');
            produtos.hortifruti.forEach(produto => {
                gridHortifruti.appendChild(criarProdutoCard(produto));
            });
            const gridPadaria = document.querySelector('#padaria .produtos-grid');
            produtos.padaria.forEach(produto => {
                gridPadaria.appendChild(criarProdutoCard(produto));
                });
            const gridFrios = document.querySelector('#frios .produtos-grid');
            produtos.frios.forEach(produto => {
                gridFrios.appendChild(criarProdutoCard(produto));
            });
            // Bebidas
            const gridBebidas = document.querySelector('#bebidas .produtos-grid');
            produtos.bebidas.forEach(produto => {
                gridBebidas.appendChild(criarProdutoCard(produto));
            });
            // Carnes
            const gridCarne = document.querySelector('#carnes .produtos-grid');
            produtos.carnes.forEach(produto => {
                gridCarne.appendChild(criarProdutoCard(produto));
            });
        }
        carregarProdutos();

        document.addEventListener('DOMContentLoaded', () => {
            const carrinho = [];
            // Adicionar ao Carrinho
            function adicionarAoCarrinho(nome, preco) {
                const itemExistente = carrinho.find(item => item.nome === nome);
                if (itemExistente) {
                    itemExistente.quantidade++;
                } else {
                    carrinho.push({ nome, preco: parseFloat(preco), quantidade: 1 });
                }
                atualizarMiniCarrinho();
            }

            // Atualizar Mini Carrinho
            function atualizarMiniCarrinho() {
                const miniCarrinhoItens = document.getElementById('mini-carrinho-itens');
                const miniCarrinhoTotal = document.getElementById('mini-carrinho-total');
                miniCarrinhoItens.innerHTML = '';
                let total = 0;

                carrinho.forEach(item => {
                    total += item.preco * item.quantidade;
                    const li = document.createElement('li');
                    li.innerHTML = `
                ${item.nome} - ${item.quantidade}x R$ ${item.preco.toFixed(2)}
                <button onclick="removerDoCarrinho('${item.nome}')">Remover</button>
            `;
                    miniCarrinhoItens.appendChild(li);
                });

                miniCarrinhoTotal.textContent = total.toFixed(2);
                exibirMiniCarrinho();
            }

            // Remover do Carrinho
            function removerDoCarrinho(nome) {
                const index = carrinho.findIndex(item => item.nome === nome);
                if (index !== -1) {
                    carrinho.splice(index, 1);
                }
                atualizarMiniCarrinho();
            }

            // Exibir Mini Carrinho
            function exibirMiniCarrinho() {
                const miniCarrinho = document.getElementById('mini-carrinho');
                miniCarrinho.style.display = carrinho.length > 0 ? 'block' : 'none';
            }

            // Abrir Carrinho Completo
            window.abrirCarrinhoCompleto = function () {
                localStorage.setItem('carrinho', JSON.stringify(carrinho));
                window.location.href = 'carrinho.html';
            };

            // Adicionar evento para botões "Adicionar ao Carrinho"
            document.querySelectorAll('.botao-comprar').forEach(botao => {
                botao.addEventListener('click', event => {
                    const produtoCard = event.target.closest('.produto-card');
                    const nome = produtoCard.querySelector('h3').textContent;
                    const preco = produtoCard.querySelector('.produto-preco').textContent.replace('R$ ', '');
                    adicionarAoCarrinho(nome, preco);
                });
            });
        });
    });
