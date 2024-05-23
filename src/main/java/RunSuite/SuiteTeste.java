package RunSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import UC_01_Realizar_Cadastro.Realizar_Cadastro;
import UC_02_Realizar_Login.Realizar_Login;
import UC_03_Realizar_Compra.Realizar_Compra;
import UC_04_Desativar_Assinatura.Desativar_Assinatura;
import UC_05_Remover_do_Carrinho.Remover_do_Carrinho;
import UC_06_Realizar_LogOut.Realizar_LogOut;

@RunWith(Suite.class)
@SuiteClasses({
	Realizar_Cadastro.class,
	Realizar_Login.class,
	Realizar_Compra.class,
	Desativar_Assinatura.class,
	Remover_do_Carrinho.class,
	Realizar_LogOut.class
})

public class SuiteTeste {

}
