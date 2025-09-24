📦 Sistema de Cálculo de Frete Refatorado
📖 Sobre o Projeto

Esse projeto foi desenvolvido a partir de um sistema legado que estava cheio de if-else, acoplado e difícil de expandir.
O objetivo foi refatorar o código aplicando princípios de Clean Code e SOLID, principalmente o princípio Aberto-Fechado (OCP), deixando o sistema mais limpo, flexível e fácil de manter.

Agora, novos tipos de frete, promoções ou formatos de etiqueta podem ser adicionados sem alterar o código existente — basta criar uma nova classe que implemente a interface correspondente.

🔑 Principais Mudanças Realizadas

✅ Remoção de if-else encadeados: substituídos por abstrações (interfaces e polimorfismo).

✅ Separação em camadas e pacotes: domínio, frete, promoções, serviços e exceções.

✅ Validações no domínio: Entrega não permite criar objetos inválidos.

✅ Tratamento de erros com exceções: mais previsibilidade e robustez.

✅ Desconto padrão igual a 0: facilita a lógica e evita condicionais desnecessárias.

✅ Testes unitários com JUnit: validação automática das principais regras de negócio.

✅ Baixo acoplamento: usando interfaces, composição e injeção de dependências.


🏗️ Estrutura do Projeto
src/

├── dominio/

│   └── Entrega.java

├── frete/

│   ├── CalculadoraFrete.java

│   ├── FreteExpresso.java

│   ├── FretePadrao.java

│   └── FreteEconomico.java

├── promocoes/

│   └── PromocaoFrete.java

├── servicos/

│   └── EtiquetaService.java

├── excecoes/

│   └── EntregaInvalidaException.java

└── Main.java


📂 domínio → entidades principais (ex.: Entrega).

📂 frete → diferentes estratégias de cálculo de frete.

📂 promocoes → regras de descontos e promoções.

📂 servicos → lógica de geração de etiquetas.

📂 excecoes → tratamento de erros e estados inválidos.


🧪 Testes Automatizados

Os testes foram implementados com JUnit 5, garantindo a corretude do sistema. Exemplos:

Verificação de promoção de frete grátis;

Cálculo de desconto por peso;

Cálculo correto do valor de cada tipo de frete;

Validação da criação de Entrega com dados válidos e inválidos.

Exemplo de teste:

@Test
void deveAplicarDescontoPorPeso() {

    Entrega entrega = new Entrega("Rua Y", "Paula", 11);
    
    double valor = PromocaoFrete.aplicarDescontoPorPeso(entrega, new FreteEconomico());
    
    assertEquals(6.0, valor, 0.01);
}

🚀 Benefícios da Refatoração

Código mais limpo e legível.

Sistema extensível, preparado para crescer sem modificações em código existente.

Manutenção facilitada: cada módulo tem uma única responsabilidade.

Testabilidade: fácil garantir que cada regra de negócio funciona corretamente.

Robustez: exceções e validações evitam estados inválidos.



💡 Como Rodar o Projeto

Clone o repositório:

git clone <seu-repo>


Abra no IntelliJ IDEA ou em outra IDE com suporte a Maven.

Compile e rode os testes:

mvn clean test

Execute a classe Main para rodar o sistema.


👩‍💻 Autor(a)

Projeto desenvolvido por Maria Luiza Fidalgo da Costa

Estudante de Engenharia de Software - Instituto Infnet
