<h1 align="center"> 🏖️Agência EHPP: Sua viagem começa aqui 🏖️</h1>

<div align="center">
<img src="https://github.com/EullerFPassos/github/assets/146894045/c5282895-a88d-49ec-b2c3-30aeb1fc4854" width="500px" />
</div>

<!-- INTRODUÇÃO -->
## 📝 DESCRIÇÃO DO PROJETO:
<p align="center">Bem-vindo à Agência EHPP, onde cada detalhe é cuidadosamente planejado para transformar suas viagens em experiências inesquecíveis. A Agência EHPP oferece uma solução eficiente para a administração de suas ofertas de viagens, com um sistema de CRUD (Create, Read, Update, Delete), onde é possível inserir seu local de destino, dia de partida, volta e consultar os preços.</p>

<!-- DESENVOLVEDORES -->
## 👨🏻‍💻 DESENVOLVEDORES

<img src="https://i0.wp.com/kenzie.com.br/blog/wp-content/uploads/2021/01/kenzie_blog_desenvolvedor-de-software.jpg?fit=1200%2C630&ssl=1" alt="Computador programando" min-width="400px" max-width="400px" width="400px" align="right">

<p align="left"> 
 Meu nome é <b>Euller Passos (RA: 202110329)</b>, tenho 22 anos, sou Analista de Sistemas de Automação na Rhodia Solvay Group há quse 5 anos. Sempre trabalhei com alguns sistemas de gestão de estoque como SAP. Com o tempo me desenvolvi na parte da Automação Industrial, adiquirindo grande conhecimento no desenvolvimento de receitas pelo supervisório da Yokogawa (CentumVP) e no Pi Vision, ferramenta de análise de dados para engenharia de Processos. Ao longo desse período ingressei no curso de Engenharia de Computação na Universidade São Francisco.
</p>

<p align="left">
  📊 <b>Ocupação:</b> Analista de Sistemas de Automação
</p>

<p align="left">
  💌 <b>Entre em contato comigo:</b> ⤵️
</p>

<p align="left">
  <a href="mailto: euller.passos@solvay.com" title="Gmail">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=LINK-DO-SEU-GMAIL" alt="Gmail"/></a>

  <a href="https://www.instagram.com/EullerPassos/" title="Instagram">
  <img src="https://img.shields.io/badge/-Instagram-DF0174?style=flat-square&labelColor=DF0174&logo=instagram&logoColor=white&link=LINK-DO-SEU-INSTAGRAM" alt="Instagram"/></a>
</p>

</br>


<img src="https://agilize.com.br/blog/wp-content/uploads/2022/12/desenvolvedor-pj.png" alt="Homem programando" min-width="400px" max-width="400px" width="400px" align="right">

<p align="left"> 
 Meu nome é <b>Henrique Pasti (RA: 202117793)</b>, tenho 21 anos, sou Estagiário de produção na Valeo. Desde novo me interesso em programar, por conta disso, estou cursando o 6 º semestre de Engenharia de Computação na Universidade São Francisco, para me desenvolver ainda mais como profissional e adiquirir grande experiência e êxito ao decorrer da minha carreira .
</p>

<p align="left">
  📊 <b>Ocupação:</b> Estagiário de Produção
</p>

<p align="left">
  💌 <b>Entre em contato comigo:</b> ⤵️
</p>

<p align="left">
  <a href="mailto: Henrique.Pasti@mail.usf.edu.br" title="Gmail">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=LINK-DO-SEU-GMAIL" alt="Gmail"/></a>

  <a href="https://www.instagram.com/rique_pasti/" title="Instagram">
  <img src="https://img.shields.io/badge/-Instagram-DF0174?style=flat-square&labelColor=DF0174&logo=instagram&logoColor=white&link=LINK-DO-SEU-INSTAGRAM" alt="Instagram"/></a>
</p>

</br>

<!-- FERRAMENTAS UTILIZADAS -->
## 🧰 DESENVOLVIDO COM AS SEGUINTES FERRAMENTAS:

<table>
  <tr>
    <td><bold>Application</bold></td>
    <td><bold>Version</bold></td>
  </tr>
  <tr>
    <td>Spring tools suite 4</td>
    <td>4.20.1</td>
  </tr>
   <tr>
    <td>Java Json Tools</td>
    <td>1.12</td>
  </tr>
    </tr>
   <tr>
    <td>Postman</td>
    <td>10.20.3</td>
  </tr>


</table>

<!-- FUNCIONALIDADES -->
## ⚙️ FUNCIONALIDADES

<h3>1. Cadastro de Pacotes (Create):</h3>
<ul>Permite a adição de novos pacotes de viagens. Sendo possível inserir o local de destino, data de saída,volta e o preço das acomodações.</ul>

<h3>2. Consulta de Pacotes (Read):</h3>
<ul>Fornece uma vizualização de todos pacotes disponíveis, contendo seu preço e as datas disponíveis.</ul>

<h3>3. Atualizações (Update):</h3>
<ul>Possibilita a edição de detalhes dos pacotes de viagens, a fim de corrigir preços, datas e locais.</ul>

<h3>4. Remoção de Pacotes (Delete):</h3>
<ul>Permite a exclusão de pacotes não disponíveis. Garatindo que cada viagem seja existente e possível.</ul>

<p align="right">(<a href="#readme-top">Voltar ao topo</a>)</p>

<br>

<!-- REPOSITÓRIO -->
<h2 align="left">📁 PROJETO: </h2>

- Clonar o Repositório <br>
  `git clone https://github.com/EullerFPassos/github

- Arquivos Git no logo abaixo: <br>
<a href="https://github.com/EullerFPassos/github.git">
  <img src="https://cdn.icon-icons.com/icons2/1673/PNG/512/downloadoutline_110860.png" alt="GitHub" style="width:50px;">
</a>

<br>

<!-- POSTMAN -->
## ✔️ EXEMPLO DE FUNCIONAMENTO:

<h4>agenicaController:</h4>

   - `GET`
      - Endpoint: `/pacotes`
      - Exemplo de Saída:
      ```bash
      [
         {
             "id": 1,
             "destino": "Finlândia",
             "data_chegada": "03/12/2023"
             "data_Saída": "10/12/2023"
             "preco": "15000"
         }
      ]
      ```

   - `POST`
     - Endpoint: `/pacotes`
     - Exemplo de entrada:
     ```bash
     [
         {
             "id": 1,
             "destino": "Noruega",
             "data_chegada": "05/12/2023"
             "data_Saída": "10/12/2023"
             "preco": "10000"
         }
     ]
     ```
  
  - `PUT`
      - Endpoint: `/pacotes/{id}`
      - Exemplo de entrada:
      ```bash
      [
         {
             "destino": "Nova Zelândia",
             "data_chegada": "03/12/2023"
             "data_Saída": "10/12/2023"
             "preco": "15000"
         }
      ]
      ```

  - `DELETE`
      - Endpoint: `/pacotes/{id}`
      - Exemplo de entrada:
      ```bash
      [
             {
             "id": 1,
             }
     ]
       ```

