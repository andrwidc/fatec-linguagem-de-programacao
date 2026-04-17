print("\n==== SISTEMA SORVETERIA MVP ====")

acesso = input("\nDigite uma opção de acesso: \n1-Visualizar pedidos \n2-Acessar Estoque \n3-Sair \n\nOpção Selecionada: ")
print("-------------------")

match acesso:
    case "1":
        print("\nVisualizando pedidos...")
    case "2":
        produtos = []
        
        while True:
            print("\n=== ESTOQUE ===")
            print("\n1 - Adicionar novo produto")
            print("2 - Listar produtos")
            print("3 - Sair")
            
            opcao = input("Opção Selecionada: ")
            
            if(opcao == "1"):
                nomeProduto: input("Nome do produto: ")
                valorUnitario: float(input("Valor: R$"))
                quantidade: int(input("Quantidade: "))
                categoria: input("Categoria do produto")
                
                if(quantidade < 0):
                    print("ERRO: quantidade não pode ser negativo!")
                else:
                    produtos.append([nome, quantidade, preco])
                    print("Produto adicionado com sucesso!")
                    
            elif opcao == "2":
                print("\n=== Produtos em estoque ===")
                for p in produtos:
                    print("Nome:", p[0])
                    print("Quantidade:", p[1])
                    print("Preço:", p[2])
                    print("Categoria", p[3])
                    print("-------------------")
                    
            elif opcao == "3":
                print("Saindo...")
            break

        else:
            print("Opção inválida.")
        
    case "3":
        print("Saindo...")
