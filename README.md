1 - Getteers/Setters são úteis e necessários principalmente para a segurança do código, já que com eles, apenas a própria classe pode realizar alterações em variáveis que apenas a classe em si deveria ter acesso. <br />
Além disso, eles também permitem a criação de validações, para que determinados valores tenham regras e limites do quanto podem ser alterados. Um setter pode por exemplo, verificar se o valor recebido é positivo ou negativo, e negar valores menores que 0, coisa que o código principal as vezes pode acabar não fazendo e ter um valor negativo naquela variável poderia comprometer o código inteiro, então na dúvida é melhor garantir a integridade adicionndo validações no Setter.<br /><br />

2 -<br />
a) Título, Autor, Preço, Editora, Tags (Gêneros), Ano de Lançamento e Disponibilidade (caso ele já esteja emprestado ou não)<br />
b) Pois ela representa um minimundo, uma representação de algo disponível no mundo real, apenas armazenando valores necessários para a aplicação em si.<br />
3) <br />
listarLivros()<br />
pesquisarLivro():<br />
adicionarLivro();<br />
removerLivro();<br />
emprestar()<br />
devolver()<br />
