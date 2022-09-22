# Notes Git/GitHub

### Comandos Básicos

- Iniciar repositório git
	```bash
	git init
	```

- Adicionar alterações na árvore de versionamento
	- Apontando para o arquivo desejado
		```bash
		git add nomeDoArquivo
		```
	- Todos os arquivos e alterações de uma só vez
		```bash
		git add . # ou
		git add * # ou ainda
		git add -all
		```
- Ver status do repositório git
	```bash
	git status
	```

- Criar ponto na árvore do repositório git
	```bash
	git commit -m "descrição do ponto a ser gerado"
	```

- Ver os logs dos commits inseridos
	```bash
	git log
	```

- Adicionar repositorio GitHub remoto
	```bash
	git remote add origin 'linkDoGitHub'
	```

- Verificar endereço do repositório remoto
	```bash
	git remote -v
	```

- Enviar alterações do repositório local para o repositório remoto GitHub
	```bash
	git push -u origin main
	```

- Baixar última versão do repositório remoto para o repositório local
	```bash
	git pull
	```

- Clonar um repositório remoto já existente para o disco local
	```bash
	git clone 'linkDoGitHub'
	```

- Mudar a branch principal de master para main
	```bash
	git branch -m master main
	```

### Criando chave SSH e Adicionando ao GitHub

- Gerar chaves ssh
	```bash
	ssh-keygen -t ed25519 -C seuEmail@mail.com
	```

- Ver e copiar chaves criadas
	```bash
	cat ~/.ssh/id_ed25519.pub # Se indicou um nome para o arquivo a ser gerado, aponte para oNomeQueCriou.pub

	# Copie a chave para colar nas configurações de acesso do GitHub (ver caminho no passo a seguir)
	```

- No GitHub pelo atalho de seu avatar acesse:
	> Settings > SSH and GPG Keys > New SSH Key 

- Habilite o ssh-agent para utilizar sua chave privada de acesso
	```bash
	eval $(ssh-agent -s)
	```

- Adicione a chave privada ao ssh-agent
	```bash
	ssh-add ~/.ssh/id_ed25519 # Se indicou um nome para o arquivo a ser gerado, aponte para oNomeQueCriou

	# Será solicitado o passphrase (senha inserida no momento da criação da chave)
	```

- Testar conexão SSH com GitHub
	```bash
	ssh -T git@github.com
	```

[Documentação sobre SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)