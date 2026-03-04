# Projeto FiapRide 🚗

Este projeto foi desenvolvido para praticar conceitos básicos de Programação Orientada a Objetos (POO) em Java.

## 📦 Classe Carro

A classe `Carro` representa um veículo dentro do sistema.

Ela possui dois atributos:

- cor
- carroceria

## ⚙️ Métodos criados

Foram implementados dois métodos para alterar o estado do objeto:

### alterarCor(String novaCor)
- Altera a cor do carro.
- Se a cor informada for uma string vazia (""), o sistema exibe a mensagem:
  "Cor inválida."
- Caso contrário, a cor é atualizada.

### alterarCarroceria(String novaCarroceria)
- Altera o tipo de carroceria do carro.
- Se a carroceria informada for uma string vazia (""), o sistema exibe a mensagem:
  "Carroceria inválida."
- Caso contrário, a carroceria é atualizada.

## 🧪 Testes

No `SistemaPrincipal`, o objeto foi instanciado e testado com valores válidos e inválidos, garantindo que o estado do objeto não fique inconsistente.

## 🎯 Objetivo

Aplicar os seguintes conceitos:

- Classe
- Atributos
- Métodos
- Instanciação de objeto
- Validação com if
- Versionamento com Git