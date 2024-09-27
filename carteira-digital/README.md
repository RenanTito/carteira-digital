# carteira-digital
Esta aplicação é uma API REST para gerenciar uma carteira digital. Abaixo estão as instruções para executar o projeto localmente e no Docker, além de informações sobre endpoints e outras funcionalidades.

# Requisitos
Java 17
Maven 3.8+
Docker e Docker Compose instalados
PostgreSQL configurado via Docker (ou localmente, conforme o docker-compose.yml)

# Executando a aplicação
# Localmente com Spring Boot
Para rodar a aplicação localmente, execute o comando abaixo:
mvn spring-boot:run

# Criando uma imagem Docker
Para empacotar a aplicação e criar uma imagem Docker, use o seguinte comando:
mvn spring-boot:build-image

# Executando com Docker Compose
Inicie o ambiente com o Docker Compose, o qual inclui a aplicação e o banco de dados PostgreSQL:
docker-compose up

# Verificando a execução dos containers
Para inspecionar o status do container PostgreSQL:
docker inspect carteira-digital-db

# Swagger
A documentação da API está disponível via Swagger após a inicialização da aplicação. Acesse:
[Swagger UI](http://localhost:8081/swagger-ui/index.html#/)

# Endpoints Disponíveis
GET /api/wallet/saldo
Retorna o saldo da carteira.

GET /api/wallet/extrato
Consulta o extrato da carteira digital.
Parâmetro periodo disponível como query param:
Opções: 7, 15, 30, 60, 90 dias ou intervalo de datas no formato dd/MM/yyyy.

# Banco de Dados
A aplicação utiliza PostgreSQL como banco de dados, configurado via Docker. Caso o container carteira-digital-db esteja em execução, ele estará acessível na porta padrão 5432.