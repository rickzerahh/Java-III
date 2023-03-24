# p3projects

Classes

O projeto de programação orientada à objeto será a implementação de um sistema
de cinema, o projeto deve ter as seguintes classes(todas as classes devem ser
implementadas com seus gets e sets e seus respectivos construtores e por padrão
todos os atributos private e todos os métodos public):
● Usuário;
● Sala;
● Seção;
● Filme;
● Bilhete;
● Compra.

Usuário

● A classe de usuário representa quem está comprando os bilhetes online, este
usuário deve ter os seguintes atributos: user, CPF, senha, idade, sexo, email,
nome do cartão, número do cartão e código verificador do cartão; Além disto
o usuário pode realizar, alterar ou cancelar uma compra. A classe de compra
será explanada a seguir.

Filme e bilhete

● Filme - É a classe que representa o filme exibido na sessão da sala, ela deve
ter os seguintes atributos: nome, duração, sinopse, valor.
● Bilhete - A classe bilhete irá conter as seguintes informações: user, CPF, sala,
sessão, filme, valor(o valor é calculado baseado no filme e na sala escolhidos),
cadeira comprada;

Compra

● A classe compra é a classe que contém as compras que podem ser realizadas, a
compra pode conter itens como pipoca, refrigerante, chocolate ou qualquer outro
item que esteja disponível(para este projeto não vamos trabalhar com estoque de
itens, suponha que o estoque para os itens vendidos seja infinito), e deve ter um ou
mais bilhetes. O método de compra de bilhetes deve ser um método a parte,
inicialmente o usuário irá buscar pelas sessões em cada sala, cada sala deve conter
o filme em cartaz juntamente com o horário do filme(para este projeto, não vamos
levar em consideração a comparação do horário atual com o horário de exibição do
filme), uma vez que a sessão da sala tenha sido escolhida o usuário pode comprar
os bilhetes, caso ele compre apenas um bilhete ele vai escolher uma poltrona livre
dentro da sessão, o usuário também pode comprar vários bilhetes, caso seja
comprado o sistema dará sugestões de cadeiras que estejam juntas para que todos
possam se sentar juntos.

Sala

● A classe de sala irá compor uma lista de sessões, a lista têm um tamanho fixo com
uma grade de horário, caso não exista uma sessão em algum horário, aquela sessão
será registrada como nula e não irá aparecer para o usuário;

Sessão

● A sessão deve conter o filme exibido juntamente com as cadeiras disponíveis para
compras, as cadeiras devem ser implementadas de acordo com a seguir sendo que
existem 15 colunas.
