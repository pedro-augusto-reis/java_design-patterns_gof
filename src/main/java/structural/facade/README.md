#### Padr�o
Provide a unified interface to a set of interfaces in a subsystem. 
Fa�ade defines a higher-level interface that makes the subsystem easier to use.

#### Diagrama sequ�ncia
Tudo que o cliente precisa � realizar o contato diretamente com o Facade, que se encarrega de esconder c�digos legados 
ou bibliotecas de terceiros.  

![Command Sequence](../../../resources/facade_seq.png)

#### When would you use this pattern
in web services, one web service might provide access to a number of smaller services that 
have been hidden from the caller by the facade. 

Assim sendo, o padr�o de projeto Facade � frequentemente implementado para fornecer um acesso simples e unificado a 
sistemas legados, criar uma API p�blica para classes (como os drivers), combinar servi�os e oferecer um acesso �nico 
de granula��o grossa, reduzir as chamadas de rede, encapsular o fluxo e detalhes internos de uma aplica��o para 
seguran�a e simplicidade.

#### Fonte
[DevMedia](https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469)