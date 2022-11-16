package metodosget;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import runningstep.StepsRunning;

public class MetodosGetStock extends StepsRunning {

	//public void clicarX(By elemento) {
		//driver.findElement(elemento).click();
	//}

	public void aceitarCookies(By elemento) {
		driver.findElement(elemento).click();
		
	}

	public void clicarNovidades(By elemento) {
		driver.findElement(elemento).click();
	}

	public void escolherProduto(By elemento) {
		driver.findElement(elemento).click();
	}

	//public void escolherCor(By elemento) {
		//driver.findElement(elemento).click();

	//}

	public void scrollNaTela(int n1, int n2) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
		Thread.sleep(1000);

	}

	public void escolherNumero(By elemento) {
		driver.findElement(elemento).click();

	}

	public void clicarComprar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void clicarExcluir(By elemento) {
		driver.findElement(elemento).click();
	}

	public void clicarVoltarMenu(By elemento) {
		driver.findElement(elemento).click();
	}

}
