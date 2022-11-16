package elementos;

import org.openqa.selenium.By;

public class Elementos {
	//public By clicarX = By.xpath("//div[@id='bg-sombra-floater']//div[2]//span[text()='x']");
	
	public By aceitarCookies = By.xpath("//section[@class='cookie-notification-container active']//div//div[2]");
	public By clicarNovidades = By.xpath("//div[@class='navigation-bar']//ul//li//a[text()='Novidades']");
	public By escolherProduto = By.xpath("//div[@class='item-card card-desktop card-with-rating lazy-price item-desktop--3']//div//span[text()=\"Sandália Shoestock Meia Pata Tiras New Indiana Feminina\"]");
	//public By escolherCor = By.xpath("//*[@id=\"buy-box\"]/section[1]/div/ul/li[2]");
	public By escolherNumero = By.xpath("//section[@class='product-size-selector']//div//ul//li//a[text()=\"37\"]");
	public By clicarComprar = By.xpath("//button[@id='buy-button-now']/span[text()='Comprar']");
	public By clicarExcluir = By.xpath("//div[@class='product-items']//div//i");
	public By clicarVoltarAoMenu = By.xpath("//button[@class='btn btn--secondary btn--block']");

}
