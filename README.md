## Sistema de Login Simples em Java (Para Fins de Aprendizado)

Este é um projeto de aprendizado para praticar conceitos básicos de Java, como:

- Entrada e saída de dados com `Scanner`
- Manipulação de Strings
- Estruturas condicionais (`if`, `else`)
- Loops (`while`)
- Escrita em arquivos de texto (`FileWriter`,`PrintWriter`)

**Funcionalidades:**

- Permite o registro de um novo usuário com login e senha.
- Realiza a validação básica do login e senha (tamanho mínimo).
- Persiste os dados de login em um arquivo de texto (`dados.txt`).
- Autentica o usuário comparando as credenciais fornecidas com os dados no arquivo.

**Observações Importantes:**

- **Este projeto NÃO se destina ao uso em produção.** Ele não implementa nenhum tipo de segurança adequada para senhas ou proteção contra vulnerabilidades comuns em sistemas de autenticação.
- A persistência de dados em arquivo de texto é apenas para fins de demonstração e não é adequada para cenários reais.

**Melhorias Futuras:**

- Implementar hashing de senha para armazenar as senhas de forma segura.
- Usar um banco de dados para persistência de dados em vez de arquivos de texto.
- Adicionar tratamento de erros mais robusto.

**Talvez eu adicione:**

- Implementar interface gráfica (GUI) para uma melhor experiência do usuário.
