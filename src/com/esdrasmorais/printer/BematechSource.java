package com.esdrasmorais.printer;

public class BematechSource {

	public static native int AlteraSimboloMoeda(String simboloMoeda);
	public static native int AbreCupom(String cPF);
	public static native int AbreCupomCV0909(String cPF,String cNome,String endereco);
	public static native int AumentaDescricaoItem(String descricao);
	public static native int AbreComprovanteNaoFiscalVinculado(String formaPagamento,String valor,String numeroCupom);
	public static native int AbreComprovanteNaoFiscalVinculadoCV0909(int formaPagamento, String indiceFormaPagamento, int quantidadePagamento, int numeroPagamento, String cPF, String cNome, String endereco);
	public static native int Autenticacao();
	public static native int AberturaDoDia(String valorAux,String formaPagamento);
	public static native int AbrePortaSerial();
	public static native int AbrePorta(int numero);
	public static native int AbreBilhetePassagem(String imprimeValorFim,String imprimeEnfatizado,String embarque,String destino,String linha,String prefixo,String agente,String agencia,String data,String hora,String poltrona,String plataforma);
	public static native int Acrescimos(BemaStringSource valorAcrescimo);
	public static native int AcrescimosICMS(BemaStringSource valorAcrescimo);
	public static native int AcrescimosISS(BemaStringSource valorAcrescimo);
	public static native int AcrescimosAcumuladoICMS(BemaStringSource valorAcrescimo);
	public static native int AcrescimosAcumuladoISS(BemaStringSource valorAcrescimo);
	public static native int CancelaItemAnterior();
	public static native int CancelaItemGenerico(String numeroItem);
	public static native int CancelaCupom();
	public static native int CancelaCupomCV0909(String COO);
	public static native int CancelaCupomAtualCV0909();
	public static native int EfetuaFormaPagamento(String formaPagamento, String valorFormaPagamento);
	public static native int EfetuaFormaPagamentoDescricaoForma(String formaPagamento, String valorFormaPagamento, String descricaoForma);
	public static native int EfetuaFormaPagamentoIndice(String indice,String valorFormaPagamento);
	public static native int EspacoEntreLinhas(int dots);
	public static native int EstornoFormasPagamento(String formaOrigem,String formaDestino,String valor);
	public static native int EstornoFormasPagamentoCV0909(String formaOrigem,String formaDestino,String valor,int destinoPagamentoSequencia,String mensagem);
	public static native int FechaCupom(String formaPagamento,String acrescimoDesconto,String tipoAcrescimoDesconto,String valorAcrescimoDesconto,String valorPago,String mensagem);
	public static native int FechaCupomResumido(String formaPagamento,String mensagem);
	public static native int ForcaImpactoAgulhas(int iValorImpacto);
	public static native int IniciaFechamentoCupom(String acrescimoDesconto,String tipoAcrescimoDesconto,String valorAcrescimoDesconto);
	public static native int LinhasEntreCupons(int linhas);
	public static native int NomeiaDepartamento(int indice, String departamento);
	public static native int NomeiaTotalizadorNaoSujeitoIcms(int indice, String totalizador);
	public static native int NomeiaTotalizadorNaoSujeitoIcmsCV0909(int indice, String totalizador, String entraOuSai);
	public static native int ProgramaIdentificacaoConsumidor(String cPF,String cNome,String endereco);
	public static native int ProgramaAliquota(String aliquota, int vinculo);
	public static native int ProgramaAliquotaCV0909(String aliquota, int tipoAliquota, String indiceAliquota);
	public static native int ProgramaAliquotasEspeciais(String aliquotaF, String aliquotaI, String aliquotaN, String aliquotaFS, String aliquotaIS, String aliquotaNS);
	public static native int ProgramaArredondamento();
	public static native int ProgramaTruncamento();
	public static native int ProgramaHorarioVerao();
	public static native int ProgramaHorarioVeraoCV0909(int modo);

	public static native int VendeItem(String codigo, String descricao, String aliquota, String tipoQuantidade, String quantidade, int casasDecimais, String unitario, String tipoDesconto, String desconto);
	public static native int VendeItemCV0909(String codigo, String descricao, String aliquota, String quantidade, int casasDecimais, String unitario, String unidadeMedida, String valorUnitarioDecimal, String tipoDeCalculo);
	public static native int VendeItemDetalhadoCV0909(String code, String description, String tax, String unitOfMeasure,String quantity, String decimalsQuantity, String unitaryValue,String decimalUnitaryValue, String typeOfCalculation,String EAN13, String NCM,String CFOP, String additionalInformation,String productOrigin, String CST_ICMS, String simplesCode, String IBGECityCode,String itemServiceList, String ISSCode, String ISSOperationNature,String ISSIncentiveIndicator);
	public static native int VendeItemCompleto(String code, String EAN13, String description, String indexDepartment, String tax, String unitOfMeasure, String quantityType, String decimalsQuantity, String quantity, String decimalsUnitaryValue, String unitaryValue, String increaseDiscountType, String incrementValue, String discountValue, String typeOfCalculation, String NCM, String CFOP, String additionalInformation, String CST_ICMS, String productOrigin, String itemServiceList, String ISSCode, String ISSOperationNature, String ISSIncentiveIndicator, String IBGECode, String CSOSN, String basisCalculuationValue, String ICMSValueRetained, String reserved01, String reserved02, String reserved03, String reserved04, String reserved05, String reserved06, String reserved07, String reserved08, String reserved09, String reserved10, String reserved11, String reserved12, String reserved13, String reserved14, String reserved15, String reserved16, String reserved17, String reserved18, String reserved19, String reserved20, String reserved21, String reserved22, String reserved23, String reserved24, String reserved25, String reserved26, String reserved27, String reserved28, String reserved29, String reserved30, String reserved31, String reserved32, String reserved33, String reserved34, String reserved35);
	
	
	
	public static native int VendeItemDepartamento(String codigo,String descricao,String aliquota,String valorUnitario,String cQuantidade,String valorAcrescimo,String valorDesconto,String indiceDepartamento,String cUnidadeMedida);
	public static native int TerminaFechamentoCupom(String mensagem);
	public static native int TerminaFechamentoCupomCV0909(String mensagem, int cupomAdicional, int guilhotina);
	public static native int UsaUnidadeMedida(String cUnidadeMedida);
	public static native int RetornaFatMFD();
	public static native int LeituraMemoriaFiscalData(String dataInicial, String dataFinal);
	public static native int LeituraMemoriaFiscalReducao(String cReducaoInicial, String cReducaoFinal);
	public static native int LeituraMemoriaFiscalSerialData(String dataInicial, String dataFinal);
	public static native int LeituraMemoriaFiscalSerialReducao(String cReducaoInicial, String cReducaoFinal);
	public static native int LeituraX();
	public static native int LeituraXSerial();
	public static native int LeituraRTPACV0909();
	public static native int LeituraRTPASerialCV0909();
	public static native int ImprimeRTDCV0909(String mensagem);
	public static native int ReducaoZ(String data, String cHora);
	public static native int ReducaoZCV0909(String data, String cHora, int transmissao);
	public static native int RetornoImpressoraCV0909(BemaIntegerSource CAT, BemaIntegerSource RET1, BemaIntegerSource RET2, BemaIntegerSource RET3, BemaIntegerSource RET4);
	public static native int BufferRespostaCV0909(BemaStringSource retorno);
	
	public static native int UsaComprovanteNaoFiscalVinculado(String texto);
	public static native int FechaComprovanteNaoFiscalVinculado();
	public static native int FechaRelatorioGerencial();
	public static native int FechaRelatorioGerencialCV0909(int guilhotina);
	public static native int RelatorioGerencial(String texto);
	public static native int RecebimentoNaoFiscal(String indiceTotalizador, String valorRecebimento, String formaPagamento);
	public static native int Sangria(String valor);
	public static native int SangriaCV0909(String valor, String mensagem);
	public static native int Suprimento(String valor, String formaPagamento);
	public static native int SuprimentoCV0909(String valor, String mensagem);

	public static native int ProgramaCaracterAutenticacao(String caracter);
	public static native int VerificaEstadoGaveta(BemaIntegerSource estado);
	public static native int CancelaImpressaoCheque();
	public static native int CancelaItemParcial(String item, String quantidade);
	public static native int ImprimeCheque(String numeroBanco,String valor,String favorecido,String cidade,String data,String mensagem);
	public static native int ImprimeCopiaCheque();
	public static native int IncluiCidadeFavorecido(String cidade,String favorecido);
	public static native int ProgramaMoedaPlural(String moedaPlural);
	public static native int ProgramaMoedaSingular(String moedaSingular);
	public static native int VerificaStatusCheque(BemaIntegerSource status);

	public static native int FechamentoDoDia();
	public static native int FechaPortaSerial();
	public static native int ImprimeConfiguracoesImpressora();
	public static native int ImprimeDepartamentos();
	public static native int MapaResumo();
	public static native int RelatorioTipo60Analitico();
	public static native int RelatorioTipo60Mestre();
	public static native int ResetaImpressora();
	public static native int RetornoImpressora(BemaIntegerSource ACK, BemaIntegerSource ST1, BemaIntegerSource ST2);
	public static native int VerificaImpressoraLigada();


	public static native int ContadorBilhetePassagem(BemaStringSource contador);

	public static native int Cancelamentos(BemaStringSource cancelamentos);
	public static native int CancelamentosICMS(BemaStringSource cancelamentos);
	public static native int CancelamentosISS(BemaStringSource cancelamentos);
	public static native int CancelamentosAcumuladoICMS(BemaStringSource cancelamentos);
	public static native int CancelamentosAcumuladoISS(BemaStringSource cancelamentos);
	public static native int CGCIE(BemaStringSource CGC, BemaStringSource IE);
	public static native int ClicheProprietario(BemaStringSource clicheProprietario);
	public static native int ContadoresTotalizadoresNaoFiscais(BemaStringSource Contadores);
	public static native int CriptografiaGrandeTotal(BemaStringSource Contadores);
	public static native int DadosUltimaReducao(BemaStringSource dadosReducao);
	public static native int DataHoraImpressora(BemaStringSource data, BemaStringSource hora);
	public static native int DataHoraReducao(BemaStringSource data, BemaStringSource hora);
	public static native int DataMovimento(BemaStringSource dataMovimento); 
	public static native int Descontos(BemaStringSource descontos);
	public static native int DescontosICMS(BemaStringSource descontos);
	public static native int DescontosISS(BemaStringSource descontos);
	public static native int DescontosAcumuladoICMS(BemaStringSource descontos);
	public static native int DescontosAcumuladoISS(BemaStringSource descontos);
	public static native int EnderecoComercial(BemaStringSource endereco);
	public static native int FlagsFiscais(BemaIntegerSource flagFiscal);
	public static native int FlagsFiscaisStr(String flagFiscal);
	public static native int FlagsVinculacaoIss(BemaIntegerSource flag1, BemaIntegerSource flag2);
	public static native int GrandeTotal(BemaStringSource grandeTotal);
	public static native int MarcaImpressora(BemaStringSource marcaImpressora);
	public static native int MinutosImprimindo(BemaStringSource minutosImprimindo);
	public static native int MinutosLigada(BemaStringSource minutosLigada);
	public static native int ModeloImpressora(BemaStringSource modeloImpressora);
	public static native int ModeloVersaoImpressora(BemaStringSource modeloImpressora, BemaStringSource versao);
	public static native int MonitoramentoPapel(BemaIntegerSource linhasImpressas);
	public static native int NomeFantasia(BemaStringSource nome);
	public static native int NumeroCaixa(BemaStringSource numeroCaixa);
	public static native int NumeroCupom(BemaStringSource numeroCupom); 
	public static native int NumeroCupomCV0909(BemaStringSource numeroCupom);
	public static native int NumeroCuponsCancelados(BemaStringSource numeroCuponsCancelados);
	public static native int NumeroIntervencoes(BemaStringSource numeroIntervencoes);
	public static native int NumeroLoja(BemaStringSource numeroLoja);
	public static native int NumeroOperacoesNaoFiscais(BemaStringSource operacoes);
	public static native int NumeroOperacoesNaoFiscaisCV0909(BemaStringSource operacoes);
	public static native int NumeroReducoes(BemaStringSource numeroReducoes); 
	public static native int NumeroSerie(BemaStringSource numeroSerie);
	public static native int NumeroSubstituicoesProprietario(BemaStringSource substituicoes);
	public static native int RazaoSocial(BemaStringSource nome);
	public static native int RetornoAliquotas(BemaStringSource aliquotas);
	public static native int RetornoAliquotasCV0909(BemaStringSource aliquotas);
	public static native int SimboloMoeda(BemaStringSource simboloMoeda);
	public static native int SubTotal(BemaStringSource subTotal);
	public static native int TipoImpressora(BemaStringSource tipoImpressora);
	public static native int UltimoItemVendido(BemaStringSource ultimoItemVendido);
	public static native int VendaBruta(BemaStringSource valor);
	public static native int ValorFormaPagamento(String forma, BemaStringSource valorForma);
	public static native int ValorPagoUltimoCupom(BemaStringSource valorUltimoCupom);
	public static native int ValorTotalizadorNaoFiscal(String totalizador, BemaStringSource valor);
	public static native int VerificaAliquotasISS(BemaStringSource aliquotasISS);
	public static native int VerificaDepartamentos(BemaStringSource departamentos);
	public static native int VerificaEpromConectada(BemaStringSource flagEprom);
	public static native int VerificaEstadoImpressora(BemaIntegerSource ACK,BemaIntegerSource ST1,BemaIntegerSource ST2); 
	public static native int VerificaFormasPagamento(BemaStringSource formasPagamento);
	public static native int VerificaIndiceAliquotasIss(BemaStringSource indiceAliquotas);
	public static native int VerificaModoOperacao(BemaStringSource modoOperacao);
	public static native int VerificaModoImpressora(BemaStringSource modoImpressora);
	public static native int VerificaRecebimentoNaoFiscal(BemaStringSource recebimentos);
	public static native int VerificaReducaoZAutomatica(BemaIntegerSource flag);
	public static native int VerificaTipoImpressora(BemaIntegerSource tipo);
	public static native int VerificaTotalizadoresNaoFiscais(BemaStringSource totalizadores);
	public static native int VerificaTotalizadoresParciais(BemaStringSource totalizadores);
	public static native int VerificaTruncamento(BemaStringSource flagTruncamento);
	public static native int VersaoFirmware(BemaStringSource versaoFirmware);

	public static native int AbreBilhetePassagemMFD(String embarque,String destino,String cLinha,String agencia,String data,String cHora,String cPoltrona,String cPlataforma,String tipoPassagem,String cRG,String cNome,String endereco,String cUF);
	public static native int AbreComprovanteNaoFiscalVinculadoMFD(String formaPagamento,String valor,
																  String numeroCupom,
																  String cPF,
																  String cNome,
																  String endereco);
	public static native int AbreCupomMFD(String cPF,String cNome,String endereco);
	public static native int AbreRecebimentoNaoFiscalMFD(String cPF,String cNome,String endereco);
	public static native int AbreRecebimentoNaoFiscalCV0909(String cPF,String cNome,String endereco);
	public static native int AbreRelatorioGerencialMFD(String totalizador);
	public static native int AbreRelatorioGerencialCV0909(String totalizador);
	public static native int AcionaGuilhotinaMFD(int modo);
	public static native int AcionaGuilhotinaCV0909();
	public static native int AcrescimoDescontoItemMFD(String item,
													  String acrescimoDesconto,
													  String tipoAcrescimoDesconto,
													  String valorAcrescimoDesconto);
	public static native int AcrescimoDescontoItemCV0909(String item,
													  String acrescimoDesconto,
													  String tipoAcrescimoDesconto,
													  String valorAcrescimoDesconto);
	public static native int AcrescimoDescontoSubtotalRecebimentoMFD(String flag,
																	 String tipo,
																	 String valor);
	public static native int AcrescimoDescontoSubtotalMFD(String flag,
														  String tipo,
														  String valor);
	public static native int AcrescimoDescontoSubtotalCV0909(String flag,
															 String tipo,
															 String valor);													  
	public static native int AutenticacaoMFD(String cLinhas, String texto);
	public static native int CancelaAcrescimoDescontoItemMFD(String flag, String item);
	public static native int CancelaAcrescimoDescontoItemCV0909(String flag, String item);
	public static native int CancelaAcrescimoDescontoSubtotalMFD(String flag);
	public static native int CancelaAcrescimoDescontoSubtotalCV0909(String flag);
	public static native int CancelaAcrescimoDescontoSubtotalRecebimentoMFD(String flag);
	public static native int CancelaCupomMFD(String cPF, String cNome, String endereco);
	public static native int CancelaRecebimentoNaoFiscalMFD(String cPF, String cNome, String endereco);
	public static native int ComprovantesNaoFiscaisNaoEmitidosMFD(BemaStringSource comprovantes);
	public static native int ComprovantesNaoFiscaisNaoEmitidos(BemaStringSource comprovantes);
	public static native int CNPJMFD(BemaStringSource cNPJ);
	public static native int CNPJCV0909(BemaStringSource cNPJ);
	public static native int CodigoBarrasCODABARMFD(String codigo);
	public static native int CodigoBarrasCODE39MFD(String codigo);
	public static native int CodigoBarrasCODE93MFD(String barcode);
	public static native int CodigoBarrasCODE128MFD(String barcode);
	public static native int CodigoBarrasEAN13MFD(String barcode);
	public static native int CodigoBarrasEAN8MFD(String barcode);
	public static native int CodigoBarrasISBNMFD(String barcode);
	public static native int CodigoBarrasITFMFD(String barcode);
	public static native int CodigoBarrasMSIMFD(String barcode);
	public static native int CodigoBarrasPDF417MFD(int NCE, int altura,int largura,int numColunas,String barcode);
	public static native int CodigoBarrasPLESSEYMFD(String barcode);
	public static native int CodigoBarrasUPCAMFD(String barcode);
	public static native int CodigoBarrasUPCEMFD(String barcode);
	public static native int ConfiguraCodigoBarrasMFD(int altura, int largura,int posicaoCaracteres,int fonte,int margem);

	public static native int ContadorComprovantesCreditoMFD(BemaStringSource contador);
	public static native int ContadorComprovantesCredito(BemaStringSource contador);
	public static native int ContadorCupomFiscalMFD(BemaStringSource contador);
	public static native int ContadorCupomFiscal(BemaStringSource contador);
	public static native int ContadorFitaDetalheMFD(BemaStringSource contador);
	public static native int ContadorFitaDetalhe(BemaStringSource contador);
	public static native int ContadorOperacoesNaoFiscaisCanceladasMFD(BemaStringSource contador);
	public static native int ContadorOperacoesNaoFiscaisCanceladas(BemaStringSource contador);
	public static native int ContadorRelatoriosGerenciaisMFD(BemaStringSource contador);
	public static native int ContadorRelatoriosGerenciais(BemaStringSource contador);
	public static native int ContadoresTotalizadoresNaoFiscaisMFD(BemaStringSource contador);
	public static native int CupomAdicionalMFD();
	public static native int DadosSintegra(String dataInicial ,String dataFinal);

	public static native int DadosUltimaReducaoMFD(BemaStringSource dadosUltReducao);
	public static native int DadosUltimaReducaoCV0909(BemaStringSource dadosUltReducao);
	public static native int DataHoraUltimoDocumentoMFD(BemaStringSource dataHora);
	public static native int DownloadMF(String nomeArquivo);
	public static native int DownloadMFCV0909(String nomeArquivo, String tipo, String dadoInicial, String dadoFinal);
	public static native int DownloadMFD(String nomeArquivo,String tipoDownload,String dadoInicial,String dadoFinal,String usuario);
	public static native int DownloadMFDCV0909(String nomeArquivo, String tipoDownload,String dadoInicial,String dadoFinal);
	public static native int DownloadSB(String nomeArquivo);
	public static native int DownloadSBCV0909(String nomeArquivo);
	public static native int DownloadTDM(String nomeArquivo, String tipo, String dadoInicial, String dadoFinal);
	public static native int EfetuaFormaPagamentoMFD(String formaPagamento, 
													 String valorFormaPagamento, 
													 String cParcelas, 
													 String descricaoFormaPagto);
	
	public static native int EfetuaFormaPagamentoIndiceMFD(String indice,String valorFormaPagamento,String cParcelas, String descricaoForma);
	public static native int EfetuaFormaPagamentoIndiceCV0909(String indice,String valorFormaPagamento,String cParcelas, String descricaoForma);
	public static native int EfetuaRecebimentoNaoFiscalMFD(String indiceTotalizador, String valorRecebimento);
	public static native int EfetuaRecebimentoNaoFiscalCV0909(String indiceTotalizador, String valorRecebimento);
	public static native int EstornoNaoFiscalVinculadoMFD(String cPF, String cNome, String endereco);
	public static native int EstornoNaoFiscalVinculadoCV0909(String cPF, String cNome, String endereco, String COO);
	public static native int FechaRecebimentoNaoFiscalMFD(String mensagem);
	public static native int FechaRecebimentoNaoFiscalCV0909(String mensagem, int cutter);
	public static native int HabilitaDesabilitaRetornoEstendidoMFD(String flagRetorno);
	public static native int ImprimeChequeMFD(String numeroBanco, String valor,
											  String favorecido, String cidade,
											  String data,String msg,String impressaoVerso,
							  				  String cLinhas);
	public static native int IniciaFechamentoCupomMFD(String acrescimoDesconto,
													  String tipoAcrescimoDesconto,
													  String valorAcrescimo,
													  String valorDesconto);
	public static native int IniciaFechamentoRecebimentoNaoFiscalMFD(String acrescimoDesconto,
																	 String tipoAcrescimoDesconto,
			   														 String valorAcrescimo,
			   														 String valorDesconto);
	public static native int InscricaoEstadualMFD(BemaStringSource IE);
	public static native int InscricaoEstadual(BemaStringSource IE);
	public static native int InscricaoMunicipalMFD(BemaStringSource IM);
	public static native int InscricaoMunicipal(BemaStringSource IM);
	public static native int LeituraChequeMFD(BemaStringSource cMC7);
	public static native int LeituraMemoriaFiscalDataMFD(String dataInicial,String dataFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalDataCV0909(String dataInicial,String dataFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalReducaoMFD(String cReducaoInicial,String cReducaoFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalReducaoCV0909(String cReducaoInicial,String cReducaoFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalSerialDataMFD(String dataInicial,String dataFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalSerialDataCV0909(String dataInicial,String dataFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalSerialReducaoMFD(String cReducaoInicial,String cReducaoFinal,String flagLeitura);
	public static native int LeituraMemoriaFiscalSerialReducaoCV0909(String cReducaoInicial,String cReducaoFinal,String flagLeitura);
	public static native int MapaResumoMFD();
	public static native int MarcaModeloTipoImpressoraMFD(BemaStringSource marca, BemaStringSource modelo, BemaStringSource tipo);
	public static native int MinutosEmitindoDocumentosFiscaisMFD(BemaStringSource minutos);
	public static native int MinutosEmitindoDocumentosFiscaisCV0909(BemaStringSource minutos);
	public static native int NomeiaRelatorioGerencialMFD(String indice, String descricao);
	public static native int NomeiaRelatorioGerencialCV0909(String indice, String descricao);
	public static native int NumeroSerieMFD(BemaStringSource numeroSerie);
	public static native int NumeroSerieCV0909(BemaStringSource numeroSerie);
	public static native int NumeroSerieMemoriaMFD(BemaStringSource numeroSerie);
	public static native int PercentualLivreMFD(BemaStringSource valor);
	public static native int ProgramaFormaPagamentoMFD(String formaPagamento, String cOperacaoTef);
	public static native int ProgramaFormaPagamentoCV0909(String indicePagamento, String formaPagamento, int cCDVinculado);
	public static native int ReducoesRestantesMFD(BemaStringSource valor);
	public static native int ReducoesRestantes(BemaStringSource valor);
	public static native int ReimpressaoNaoFiscalVinculadoMFD();
	public static native int ReimpressaoNaoFiscalVinculadoCV0909();
	public static native int RetornoImpressoraMFD(BemaIntegerSource ACK,BemaIntegerSource ST1,BemaIntegerSource ST2,BemaIntegerSource ST3);
	public static native int SegundaViaNaoFiscalVinculadoMFD();
	public static native int SegundaViaNaoFiscalVinculadoCV0909();
	public static native int SubTotalizaCupomMFD();
	public static native int SubTotalizaRecebimentoMFD();
	public static native int TotalLivreMFD(BemaStringSource tamanho);
	public static native int TamanhoTotalMFD(BemaStringSource tamanho);
	public static native int TempoOperacionalMFD(BemaStringSource tempo);
	public static native int TempoOperacional(BemaStringSource tempo);
	public static native int TotalizaCupomMFD();
	public static native int TotalizaRecebimentoMFD();
	public static native int UsaRelatorioGerencialMFD(String texto);
	public static native int UsaRelatorioGerencialCV0909(String texto);
	public static native int ValorFormaPagamentoMFD(String formaPagamento, BemaStringSource valorForma);
	public static native int ValorTotalizadorNaoFiscalMFD(String totalizador, BemaStringSource valor);
	public static native int VerificaFormasPagamentoMFD(BemaStringSource formasPagamento);
	public static native int VerificaFormasPagamentoCV0909(BemaStringSource formasPagamento);
	public static native int VerificaRecebimentoNaoFiscalMFD(BemaStringSource recebimentoNaoFiscal);
	public static native int VerificaRecebimentoNaoFiscalCV0909(BemaStringSource recebimentoNaoFiscal);
	public static native int VerificaRelatorioGerencialMFD(BemaStringSource relatorio);
	public static native int VerificaRelatorioGerencial(BemaStringSource relatorio);
	public static native int VerificaTotalizadoresNaoFiscaisMFD(BemaStringSource totalizadores);
	public static native int VerificaTotalizadoresNaoFiscaisCV0909(BemaStringSource totalizadores);
	public static native int VerificaTotalizadoresParciaisMFD(BemaStringSource totalizadores);
	public static native int VersaoFirmwareMFD(BemaStringSource versao);
	public static native int VersaoFirmwareCV0909(BemaStringSource versao);
	public static native int PreparaAbreCupom(BemaStringSource cupom, BemaStringSource contadorCupom, BemaIntegerSource flag, BemaStringSource data, BemaStringSource hora, BemaStringSource numeroSerie, BemaStringSource grandeTotal);
	public static native int VendaLiquida(BemaStringSource valor);
	public static native int RetornaCasasDecimaisValorUnitario(BemaStringSource decimais);	
	public static native int RetornaCasasDecimaisQuantidade(BemaStringSource decimais);
	public static native int RetornaVersaoESCECF(BemaStringSource versao);
	public static native int RetornaSiglaMunicipio(BemaStringSource sigla);
	public static native int RetornaChavePublica(BemaStringSource softwareBasico, BemaStringSource arquivosEletronicos, BemaStringSource arquivosEmitidos, BemaStringSource acessoRemoto, BemaStringSource MIL_MIT);
	public static native int TotalizadoresICMSISS(BemaStringSource totalizador);
	public static native int TotalizadoresFIN(BemaStringSource totalizador);
	public static native int TabelaRelatoriosGerenciais(BemaStringSource relatorio);
	public static native int TabelaFormasPagamento(BemaStringSource formasPgto);
	public static native int VerificaEstadoBobinaPapel(BemaStringSource status);
	public static native int VerificaEstadoTampa(BemaStringSource status);
	public static native int VerificaZPendente(BemaStringSource status);
	public static native int VerificaContextoImpressora(BemaStringSource status);
	public static native int QuantidadeCuponsRestantes(BemaStringSource quantidade);
	public static native int VerificaURLTransmissaoDados(BemaStringSource url);
	public static native int TempoEmitindoOperacionalCV0909(BemaStringSource minutos, BemaStringSource tempoFunc);
	public static native int StatusMovimento(BemaStringSource dataMovim, BemaIntegerSource status, BemaStringSource COOInicial, BemaStringSource gradeInicialTotal);

	public static native int FormatoDadosMF(String origem,String destino,String formato,String tipoLeitura, String tipoParametro,String dadoInicial,String dadoFinal);
	public static native int FormatoDadosMFD(String arquivoMFD,String destino,String formato,String tipoDownload,String dadoInicial,String dadoFinal,String cUsuario);
	public static native int GeraRelatorioSintegraMFD(int iRelatorios,String cOrigem,String destino, String mes,String ano,String cRazaoSocial,String endereco,String numero,String complemento,String cBairro,String cidade,String CEP,String telefone,String fax,String contato);
	public static native int ImpressaoFitaDetalhe( String tipo, String dadoInicial, String dadoFinal, String usuario );
	public static native int ImpressaoFitaDetalheCV0909( String tipo, String dadoInicial, String dadoFinal);
	public static native int ProgramaIdAplicativoMFD(String idAplicativo);
	public static native int ProgramaIdAplicativoCV0909(String idAplicativo);
	public static native int RegistrosTipo60();
	public static native int RelatorioSintegraMFD(int relatorios, String arquivo,String mes,String ano,String razaoSocial,String endereco,String numero,String complemento,String bairro,String cidade,String CEP,String telefone,String fax,String contato);
	public static native int GeraRegistrosSpedMFD(String arquivoOrigem, String arquivoDestino, String dataInicial, String dataFinal, String perfil, String cfop, String cobs, String pis, String cofins);
	public static native int GeraRegistrosSpedCompleto(String arquivoOrigem, String arquivoDestino, String dataInicial, String dataFinal, String perfil, String cfop, String cobs, String pis, String cofins, String companyName, String IBGECode);	
	public static native int TerminaFechamentoCupomCodigoBarrasMFD(String mensagem,String tipoCodigo,String codigo,int iAltura,int iLargura,int iPosicaoCaracteres,int iFonte,int iMargem,int iCorrecaoErros,int iColunas);
	public static native int VersaoDll(BemaStringSource versao);
	public static native int SetaMFD(int flag);
	public static native int AtivaDesativaVendaUmaLinhaMFD(int flag);
	public static native int AtivaDesativaSensorPoucoPapelMFD(int flag);
	public static native int AtivaDesativaAlinhamentoEsquerdaMFD(int flag);
	public static native int AtivaDesativaTratamentoONOFFLineMFD(int flag);
	public static native int StatusEstendidoMFD(BemaIntegerSource status);
	public static native int TempoRestanteComprovanteMFD(BemaStringSource tempo);
	public static native int UFProprietarioMFD(BemaStringSource UF);
	public static native int UFProprietario(BemaStringSource UF);
	public static native int GrandeTotalUltimaReducaoMFD(BemaStringSource grandeTotal);
	public static native int DataMovimentoUltimaReducaoMFD(BemaStringSource dataMovimento);
	public static native int SubTotalComprovanteNaoFiscalMFD(BemaStringSource subTotal);
	public static native int InicioFimCOOsMFD(BemaStringSource COOInicial, BemaStringSource COOFinal);
	public static native int InicioFimGTsMFD(BemaStringSource GTInicial, BemaStringSource GTFinal);
	public static native int VerificaFlagCorteMFD(BemaIntegerSource flag);
	public static native int SelecionaXMLLocal();
	public static native int SelecionaIniLocal();
	public static native int CancelaItemNaoFiscalMFD(String numeroItem);
	public static native int CancelaItemNaoFiscal(String numeroItem);
	public static native int AcrescimoItemNaoFiscalMFD(String numeroItem , String acrDesc , String tipoAcrDesc , String valorAcrDesc );
	public static native int CancelaAcrescimoNaoFiscalMFD(String numeroItem,String acrDesc);
	public static native int ImprimeClicheMFD();
	public static native int ImprimeInformacaoChequeMFD(int posicao, int linhas, String mensagem);
	public static native int VerificaEstadoImpressoraMFD(BemaIntegerSource ACK,BemaIntegerSource ST1,BemaIntegerSource ST2,BemaIntegerSource ST3);
	public static native int RelatorioTipo60AnaliticoMFD();
	public static native int ReloadINIFile();
	public static native int ReloadXMLFile();
	public static native void CriptografaDescriptografa(String buffer, int tamanhoBuffer, String chave, int tamanhoChave);
	public static native int InterrompeLeiturasCV0909();
	public static native int ProgramaLoja(String numeroLoja);
	public static native int ProgramaQuantidadeDocumentosAutorizados(String data);
	public static native int ProgramaOperador(String data);

	//FUNCOES NOVAS
	public static native int AtivaDesativaCancelamentoCupom2HorasMFD(int flag);
	public static native int VerificaSensorPoucoPapelMFD(BemaStringSource flag);
	public static native int VerificaCancelamentoCupom2HorasMFD(BemaStringSource flag);
	public static native int VerificaVersaoEspecificacaoComandos(BemaStringSource ecfNumber);
	public static native int LeituraFitaDetalheMFD(String tipo,String dadoInicial,String dadoFinal, String usuario);

	public static native int NumeroSerieCriptografado(BemaStringSource NumSerie);
	public static native int NumeroSerieDescriptografado(String NumSerieCriptografado, BemaStringSource NumSerieDescriptografado);
	public static native int EfetuaFormaPagamentoIndiceDescricaoForma(String IndiceFormaPagamento, String ValorFormaPagamento, String DescricaoForma);
	public static native int AcionaGaveta();
	public static native int DadosSintegraMFD(String DataInicial, String DataFinal);
	public static native int ConfiguraCorteGuilhotinaMFD(int tempo);
	public static native int AtivaDesativaCorteTotalMFD(int flag);
	public static native int AtivaDesativaCorteProximoMFD();
	//public static native int AtivaDesativaSensorPoucoPapelMFD(int flag);
	public static native int GeraRegistrosCAT52MFD(String Origem, String data);
	public static native int GeraRegistrosCAT52MFDEx(String Origem, String data, BemaStringSource Destino);
	public static native void AlteraParametrizacaoRegistrosTipoE(int parametrizacao);
	public static native int TotalIcmsCupom(BemaStringSource cpf);
	public static native int ViraChequeMFD();
	public static native int AvancaPapelAcionaGuilhotinaMFD(int linhas, int modo);
	public static native int ImprimeChequeMFDEx(String NumeroBanco, String Valor, String Favorecido, String Cidade, String Data, String Mensagem, String Fonte);
	public static native int EstornoNaoFiscalVinculadoPosteriorMFD(String FromaPagamento, String Valor, String COOCupom, String COOCDC, String CPF, String Nome, String Endereco);
	public static native int AtivaDesativaGuilhotinaMFD(short flag);
	public static native int AbreSegundaViaNaoFiscalVinculadoMFD();
	public static native int TotalIssCupomMFD(BemaStringSource ISS);
	public static native int VendeItemArredondamentoMFD(String Codigo, String Descricao, String Aliquota, String UnidadeMedida, String QtdFracionaria, String Unitario, String Acrescimo, String Desconto, boolean Arredonda);
	public static native int FlagsFiscais3MFD(BemaIntegerSource flag);
	public static native int DataHoraGravacaoUsuarioSWBasicoMFAdicional(BemaStringSource DataUsuario, BemaStringSource DataSoftwareBasico, BemaStringSource letraAdicional);

	//FUNCOES PAF-ECF
	public static native int NomeiaRelatorioMeiosDePagamento();
	public static native int NomeiaRelatorioDocumentoAuxiliarDeVenda();
	public static native int NomeiaRelatorioDAVEmitidos();
	public static native int NomeiaRelatorioIdentificacaoPAFECF();
	public static native int NomeiaRelatoriosPAFECF();
	public static native int AbreDocumentoAuxiliarVenda(String cIndice, String cTitulo, String cNumeroDAV, String cNomeEmitente, String cCNPJ_CPFEmitente, String cNomeDestinatario, String CNPJ_CPFDestinatario);
	public static native int UsaDocumentoAuxiliarVenda(String cMercadoria, String cValorUnitario, String cValorTotal);
	public static native int FechaDocumentoAuxiliarVenda(String cTotal);
	public static native int TerminaFechamentoCupomPreVenda(String cMD5, String cNumeroPreVenda, String cMensagemPromocional);
	public static native int DAVEmitidosRelatorioGerencial(String cIndice, String cDataInicial, String cDataFinal);
	public static native int DAVEmitidosArquivo(String cNomeArquivo, String cDataInicial, String cDataFinal, String cChavePublica, String cChavePrivada);
	public static native int LeituraMemoriaFiscalSerialDataPAFECF(String cDataInicial, String cDataFinal, String cFlagLeitura, String cChavePublica, String cChavePrivada);
	public static native int LeituraMemoriaFiscalSerialReducaoPAFECF(String cCRZInicial, String cCRZFinal, String cFlagLeitura, String cChavePublica, String cChavePrivada);
	public static native int EspelhoMFD(String cNomeArquivoDestino, String cDadoInicial, String cDadoFinal, String cTipoDownload, String cUsuario, String cChavePublica, String cChavePrivada);
	public static native int ArquivoMFD(String cNomeArquivoOrigem, String cDadoInicial, String cDadoFinal, String cTipoDownload, String cUsuario, int cParametrizacao, String cChavePublica, String cChavePrivada, int iArquivoUnico);
	public static native int ArquivoMFDPath(String cNomeArquivoOrigem,String nomeArquivoDestino, String cDadoInicial, String cDadoFinal, String cTipoDownload, String cUsuario, int cParametrizacao, String cChavePublica, String cChavePrivada, int iArquivoUnico);
	public static native int IdentificacaoPAFECF(String cIndice, String cNumeroLaudo, String cCNPJDesenvolvedor, String cRazaoSocial, String cEndereco, String cTelefone, String cContato, String cNomeComercial, String cVersao, String cPrincipalExecutavel, String cMD5PrincipalExecutavel, String cDemaisArquivos, String cMD5DemaisArquivos, String cNumerosFabricacao);
	public static native int GrandeTotalCriptografado(BemaStringSource cGTCriptografado);
	public static native int GrandeTotalDescriptografado(String cGTCriptografado, BemaStringSource cGTDescriptografado);
	public static native int AbreRelatorioMeiosPagamento(String cIndice);
	public static native int UsaRelatorioMeiosPagamento(String cIdentificacao, String cTipoDocumento, String cValorAcumulado, String cData);
	public static native int FechaRelatorioMeiosPagamento();
	public static native int NomeiaRelatorios(String nome);

	//FUNCOES SIGN_BEMA
	public static native int setLibType(int type);
	public static native int genkkey(BemaStringSource pub, BemaStringSource priv);
	public static native int md5FromFile(String filename, BemaStringSource md5out);
	public static native int generateEAD(String filename, String pub, String priv, BemaStringSource ead, int sign);
	public static native int validateFile(String filename, String pub, String priv);
	
	//NFCE
	public static native int TerminaFechamentoCupomNFCe(String message, String taxes);
	public static native int DadosConsumidorNFCe(String cpf, String name, String address, String complement, String number, String neighborhood, String IBGECode, String city, String UF, String CEP, String countryCode, String country, String phone, String stateRegistrationIndicator, String stateRegistration, String SUFRAMACode, String email);
	public static native int ChaveAcessoNFCe(String index, String counter, BemaStringSource accessKey);
	public static native int UltimaChaveAcessoNFCe(BemaStringSource accessKey);
	public static native int StatusUltimaNFCe(BemaStringSource status);
	public static native int StatusUltimoCancelamentoNFCe(BemaStringSource status);
	public static native int ProgramaContadorNFCe(String index,String counter);
	public static native int NumeroSerieNFCe(BemaStringSource serialNumber);
	public static native int DadosEnvioNFCe(String layoutType,String sendType, String email);
	
	//SAT
	public static native int DadosSoftwareHouseSAT(String CNPJ, String softwareSignature);
	public static native int UltimasInformacoesSAT(BemaStringSource accessKey, BemaStringSource billNumber, BemaStringSource satNumber);
	public static native int RetornaMensagemSefaz(BemaStringSource message, BemaStringSource code, BemaStringSource errorMessage, BemaStringSource errorCode);	

	static
	{
		String OSName = System.getProperty("os.name");
		OSName = OSName.toLowerCase();

		if (OSName.contains("linux"))
		{
			System.loadLibrary("bemafiscal");
		}
		else
		{
			System.loadLibrary("BemaFI32");
		}
	}
}
