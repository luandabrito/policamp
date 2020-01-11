import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {
	
		Scanner sc = new Scanner (System.in);
		static ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
		static ArrayList<Veiculo> veiculoList = new ArrayList<Veiculo>();
		static ArrayList<Veiculo> veiculoVendidoList = new ArrayList<Veiculo>();
		static ArrayList<Servico> servicoList = new ArrayList<Servico>();
		static ArrayList<Funcionario> funcionarioList = new ArrayList<Funcionario>();
		
		public static void main(String[] args) throws Exception {
			Cliente c = new Cliente();
			c.ler(clienteList);
			Veiculo v = new Veiculo();
			v.ler(veiculoList);
			v.lervendidos(veiculoVendidoList);
			Servico s = new Servico();
			s.ler(servicoList);
			Funcionario f = new Funcionario();
			f.ler(funcionarioList);
			
			Concessionaria obj = new Concessionaria();
			obj.menu();	

	}//fecha o main
		
		public void menu() throws Exception {
			
				while(true) {
					System.out.println("\n**** MENU ****");
					System.out.println("1 - Incluir/ Alterar/ Excluir/ Listar Cliente");
					System.out.println("2 - Incluir/ Alterar/ Excluir/ Listar Veículo");
					System.out.println("3 - Incluir/ Alterar/ Excluir/ Listar Serviços");
					System.out.println("4 - Incluir/ Alterar/ Excluir/ Listar Funcionário");
					System.out.println("5 - Comprar veículo usado");
					System.out.println("6 - Vender veículo");
					System.out.println("7 - Solicitar Serviço");
					System.out.println("8 - Consultar Estoque");
					System.out.println("9 - Sair ");
					int opcao = sc.nextInt();
					sc.nextLine(); //Limpa o buffer
					if (opcao == 9) {
						break;
					} else if (opcao == 1) {
						menuCliente(sc);
					} else if (opcao == 2) {
						menuVeiculo(sc);
					} else if (opcao == 3) {
						menuServico(sc);
					}else if (opcao == 4) {
						menufuncionario(sc);
					} else if (opcao == 5) {
						comprarVeiculoUsado(sc);
					}else if (opcao == 6) {
						venderVeiculo(sc);
					}else if (opcao == 7) {
						solicitarServico(sc);
					} else if (opcao == 8) {
						consultarestoque(sc);
					}else {
						System.out.println("Opção inválida.\n");
					}
					
				}// fim do while menu
				
				sc.close();
		} // Fim do menu

		private void menuCliente(Scanner sc) throws Exception {
			
			while(true) {
				System.out.println("\n *** MENU CLIENTE ***");
				System.out.println("1 - Incluir Cliente");
				System.out.println("2 - Alterar Cliente");
				System.out.println("3 - Excluir Cliente");
				System.out.println("4 - Listar Cliente");
				System.out.println("5 - Retornar ao Menu Principal");
				int opcao = sc.nextInt();
				sc.nextLine(); //Limpa o buffer
				if (opcao == 5) {
					break;
				} else if (opcao == 1) {
					Cliente c = new Cliente();
					c.incluir(sc);
					clienteList.add(c);
					c.escrever(clienteList);
				} else if (opcao == 2) {
					Cliente c = new Cliente();
					c.listar(clienteList);
					System.out.println("\nInforme o Nome Completo do cliente:");
					String nome = sc.nextLine();
					for (Cliente d : clienteList) {
						if (d.getNome().equals(nome)) {
							d.alterar(sc);
							d.escrever(clienteList);
						}else {
							System.out.println("Cliente não localizado");
						}
					}
				} else if (opcao == 3) {
					System.out.println("\nClientes Cadastrados: ");
					for (Cliente c : clienteList) {
						System.out.println("Nome: " + c.getNome());
					}
					System.out.println("Informe o Nome Completo do cliente:");
					String nome = sc.nextLine();
					for (Cliente c : clienteList) {
						if (c.getNome().equals(nome)) {
							if (c.excluir(sc) != null) {
								clienteList.remove(c);
								c.escrever(clienteList);
								break;
							}
						}else {
							System.out.println("Cliente não localizado");
						}	
					}
				} else if (opcao == 4) {
					Cliente c = new Cliente();
					c.listar(clienteList);
				}
			}//fim do while
		}// fim do menu cliente
			
		private void menuVeiculo(Scanner sc) throws Exception {
			
			while(true) {
				System.out.println("\n *** MENU VEÍCULO ***");
				System.out.println("1 - Incluir Veículo");
				System.out.println("2 - Alterar Veículo");
				System.out.println("3 - Excluir Veículo");
				System.out.println("4 - Listar Veículo Disponível");
				System.out.println("5 - Listar Veículo Vendido");
				System.out.println("6 - Retornar ao Menu Principal");
				int opcao = sc.nextInt();
				sc.nextLine(); //Limpa o buffer
				if (opcao == 6) {
					break;
				} else if (opcao == 1) {
					Veiculo v = new Veiculo();
					v.incluir(sc);
					veiculoList.add(v);
					v.escrever(veiculoList);
				} else if (opcao == 2) {
					Veiculo v1 = new Veiculo();
					v1.listar(veiculoList);
					System.out.println("\nInforme o Código do veículo:");
					int codigo = sc.nextInt();
					sc.nextLine();
					for (Veiculo v : veiculoList) {
						if (v.getCodigo() == codigo) {
							v.alterar(sc);
							v.escrever(veiculoList);
						}	
					}
				} else if (opcao == 3) {
					Veiculo v1 = new Veiculo();
					v1.listar(veiculoList);
					System.out.println("\nInforme o Código do veículo:");
					int codigo = sc.nextInt();
					sc.nextLine();
					for (Veiculo v : veiculoList) {
						if (v.getCodigo() == codigo) {
							if (v.excluir(sc) != null) {
								veiculoList.remove(v);
								v.escrever(veiculoList);
								break;
							}
						}	
					}
				} else if (opcao == 4) {
					Veiculo v = new Veiculo();
					v.listar(veiculoList);
				} else if (opcao == 5) {
					Veiculo v = new Veiculo();
					v.listarVendidos(veiculoVendidoList);
				}
			}
			
		}// fim do menu veículo
		
		private void menuServico(Scanner sc) throws Exception {
			
			while(true) {
				System.out.println("\n *** MENU SERVIÇOS ***");
				System.out.println("1 - Incluir Serviço");
				System.out.println("2 - Alterar Serviço");
				System.out.println("3 - Excluir serviço");
				System.out.println("4 - Listar Serviços");
				System.out.println("5 - Retornar ao Menu Principal");
				int opcao = sc.nextInt();
				sc.nextLine(); //Limpa o buffer
				if (opcao == 5) {
					break;
				} else if (opcao == 1) {
					Servico s = new Servico();
					s.incluir(sc);
					servicoList.add(s);
					s.escrever(servicoList);
				} else if (opcao == 2) {
					Servico s1 = new Servico();
					s1.listar(servicoList);
					System.out.println("\nInforme o Nome do Serviço:");
					String nomeServico = sc.nextLine();
					for (Servico s : servicoList) {
						if (s.getNomeServico().equals(nomeServico)) {
							s.alterar(sc);
							s.ler(servicoList);
						}	
					}
				} else if (opcao == 3) {
					Servico s1 = new Servico();
					s1.listar(servicoList);
					System.out.println("\nInforme o Nome do Serviço:");
					String nomeServico = sc.nextLine();
					for (Servico s : servicoList) {
						if (s.getNomeServico().equals(nomeServico)) {
							if (s.excluir(sc) != null) {
								servicoList.remove(s);
								s.ler(servicoList);
								break;
							}
						}	
					}
				} else if (opcao == 4) {
					Servico s = new Servico();
					s.listar(servicoList);
				}
			}
			
		}//fim do menu servico
		
		private void menufuncionario(Scanner sc) throws Exception {
			while(true) {
				System.out.println("\n *** MENU FUNCIONÁRIO ***");
				System.out.println("1 - Incluir Funcionário");
				System.out.println("2 - Alterar Funcionário");
				System.out.println("3 - Excluir Funcionário");
				System.out.println("4 - Listar Funcionário");
				System.out.println("5 - Retornar ao Menu Principal");
				int opcao = sc.nextInt();
				sc.nextLine(); //Limpa o buffer
				if (opcao == 5) {
					break;
				} else if (opcao == 1) {
					Funcionario f = new Funcionario();
					f.incluir(sc);
					funcionarioList.add(f);
					f.escrever(funcionarioList);
				} else if (opcao == 2) {
					Funcionario f1 = new Funcionario();
					f1.listar(funcionarioList);
					System.out.println("\nInforme o Nome Completo do Funcionário:");
					String nome = sc.nextLine();
					for (Funcionario f : funcionarioList) {
						if (f.getNome().equals(nome)) {
							f.alterar(sc);
							f.escrever(funcionarioList);
						}	
					}
				} else if (opcao == 3) {
					Funcionario f1 = new Funcionario();
					f1.listar(funcionarioList);
					System.out.println("Informe o Nome Completo do Funcionário:");
					String nome = sc.nextLine();
					for (Funcionario f : funcionarioList) {
						if (f.getNome().equals(nome)) {
							if (f.excluir(sc) != null) {
								funcionarioList.remove(f);
								f.escrever(funcionarioList);
								break;
							}
						}	
					}
				}else if (opcao == 4) {
					Funcionario f = new Funcionario();
					f.listar(funcionarioList);
				}
			}//fim do while
			
		}// fim do menu funcionario
		
		private void comprarVeiculoUsado(Scanner sc) throws Exception {
			CarroUsado v = new CarroUsado();
			v.comprar(sc);
			veiculoList.add(v);
			Veiculo v1 = new Veiculo();
			v1.escrever(veiculoList);
		}
		
		private void venderVeiculo(Scanner sc) throws Exception {
			
			Cliente c1 = new Cliente();
			c1.listar(clienteList);
			System.out.println("\nInforme o nome do Cliente: ");
			String nome = sc.nextLine();
			for (Cliente c : clienteList) {
				if (c.getNome().equals(nome)) {
					Veiculo v1 = new Veiculo();
					v1.listar(veiculoList);
					System.out.println("\nInforme o Código do veículo:");
					int codigo = sc.nextInt();
					sc.nextLine();
					for (Veiculo v : veiculoList) {
						if (v.getCodigo() == codigo) {
							System.out.println("Este veículo custa: " + v.getValor() + "\nInforme a forma de pagamento: ");
							System.out.println("1 - a vista; \n2 - parcelado");
							int escolha = sc.nextInt();
							sc.nextLine();
							if (escolha == 1) {
								System.out.println("Pagamento recebido com sucesso. \nCarro vendido.\n");								
								veiculoVendidoList.add(v);
								veiculoList.remove(v);
								v.escreverVendidos(veiculoVendidoList);
								v.escrever(veiculoList);
								break;
							} else if (escolha == 2) {
								System.out.println("Informe a quantidade de parcelas: ");
								int parcela = sc.nextInt();
								sc.nextLine();
								System.out.println("Pagamento confirmardo. " + parcela + " parcelas de " + (v.getValor()/parcela) + "\nCarro vendido.\n");
								veiculoVendidoList.add(v);
								veiculoList.remove(v);
								v.escreverVendidos(veiculoVendidoList);
								v.escrever(veiculoList);
								break;
							} 
						} else {
							System.out.println("Veículo não cadastrado. Cadastre no Item 2.");
							
						}// fim do else	
					
					} // fim do for veiculo
					break;
				} else {        // fim do if nome
					System.out.println("Cliente não cadastrado. Cadastre no Item 1.");
					
				} // fim do else cliente

			}// fim do for cliente
		
		} //fim do vender veículo

		private void solicitarServico(Scanner sc) {
			
			System.out.println("\nClientes Cadastrados: ");
			for (Cliente c : clienteList) {
				System.out.println("Nome: " + c.getNome());	
			}
			System.out.println("\nInforme o nome do Cliente: ");
			String nome = sc.nextLine();
			for (Cliente c : clienteList) {
				if (c.getNome().equals(nome)) {
					System.out.println("\nServiços Cadastrados: ");
					for (Servico s : servicoList) {
						System.out.println("Nome do Serviço: " + s.getNomeServico());
					}
					System.out.println("\nInforme o Nome do Serviço:");
					String nomeServico = sc.nextLine();
					for (Servico s : servicoList) {
						if (s.getNomeServico().equals(nomeServico)) {
							System.out.println("Este serviço custa: " + s.getValorServico() + "\nInforme a forma de pagamento: ");
							System.out.println("1 - a vista; \n2 - parcelado");
							int escolha = sc.nextInt();
							sc.nextLine();
							if (escolha == 1) {
								System.out.println("Pagamento recebido com sucesso. \nEncaminhe o carro para a oficina.\n");								
							} else if (escolha == 2) {
								System.out.println("Informe a quantidade de parcelas: ");
								int parcela = sc.nextInt();
								sc.nextLine();
								System.out.println("Pagamento confirmardo. " + parcela + " parcelas de " + (s.getValorServico()/parcela) + "\nEncaminhe o carro para a oficina.\n");
							} 
						} else {
							System.out.println("Serviço não cadastrado. Cadastre no Item 5.");
							
						}// fim do else	
					
					} // fim do for veiculo
					break;
				} else {        // fim do if nome
					System.out.println("Cliente não cadastrado. Cadastre no Item 1.");
					
				} // fim do else cliente

			}// fim do for cliente
			
		} // fim do solicitar servico
	
		private void consultarestoque(Scanner sc) {
			System.out.println("Escolha o estoque: \n1 - Carros disponíveis para venda \n2 - Carros vendidos");
			int opcao = sc.nextInt();
			sc.nextLine();
			if (opcao == 1) {
				System.out.println("\nQuantidade de veículo(s) no estoque: " + veiculoList.size());
				if (veiculoList.size() != 0) {
					System.out.println("\nVeiculos Cadastrados: ");
					for (Veiculo v : veiculoList) {
						System.out.println("Código: " + v.getCodigo() + ", Modelo: " + v.getModelo() + ", Valor: " + v.getValor());
					}
				} else {
					System.out.println("Nenhum carro disponível.\n");
				}
			}else if (opcao == 2) {
				System.out.println("\nQuantidade de veículo(s) vendido(s): " + veiculoVendidoList.size());
				if (veiculoVendidoList.size() == 0) {
					System.out.println("Nenhum veículo vendido.");
				} else {
					System.out.println("\nVeiculo(s) Vendido(s): ");
					for (Veiculo v : veiculoList) {
						System.out.println("Código: " + v.getCodigo() + " Carro " + v.getEstado() + " Modelo: " + v.getModelo() + ", Valor: " + v.getValor() + "\n");
					}
				}
			}
		}	// fim do consultar estoque	

} // Fim da Classe
