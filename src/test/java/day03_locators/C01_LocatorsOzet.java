package day03_locators;

public class C01_LocatorsOzet {
      /*
        LOCATORS ::

       1-) By.id();
                 WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
                 en cok id kullanilir
                 yanlis id locate edilirse ; NoSuchElementException hatasai verir

       2-) By.name();
                  WebElement passwordTextBox = driver.findElement(By.name("field-keywords"));
                  *** Name ve Value unique ise bu methodu da kullanabiliriz

       3-) By.className();
          ----->   WebElement passwordTextBox = driver.findElement(By.className("form-control"));
                  *** Class attribute'u oldugunda kullanilabilir
                  *** Class ve value unique ise, bu methodu kullanabiliriz ancak genelde
                      class attribute ayni islevi yapan bir grup Web Elementi icin kullanilir
                  *** Class attribute'nun degeri bosluk iceriyorsa genelde By.classname() ile
                      yapilan locator'lar saglikli calismaz

       4-) By.linkText();
                  *** link oldugunda tagı a ile basliyor
            ----->    WebElement passwordTextBox = driver.findElement(By.linkText("Addresses"));
                  ***  Bu yalnizca HTML baglantilarini(link) tanimlamak icin kullanilir
                  ***  HTML link elementleri, bir web sayfasinda baglanti etiketi(tag)
                       kisaltmasi olan <a> etiketi(tag) kullanilarak temsil edilir
                  ***  Kullanici arayüzündeki (UI) hyperlinkleri kolayca taniyabilir ve sonra bu
                       yontemi kullanabilirsiniz
                  ***  Buyuk/Kucuk harfe duyarlidir (case sensitive) ve baglanti(link) metniyle eslesmelidir

         5-) By.partialLinkText();
             ----->  WebElement passwordTextBox = driver.findElement(By.partialLinkText("dresses"));
                  *** linkText() yontemine benzer
                  *** Tek fark, tam metin vermek zorunda kalmamanizdir.
                  *** Metnin yalnizca belirli bir bolumunu verebilirsiniz
                  *** Metnin tamamini verdiginizdwe de kabul eder.

         6-) By.tagName();
                ----->  WebElement passwordTextBox = driver.findElement(By.tagName("input"));
                   *** diger konum belirleyiclerden biraz farklidir
                   *** <div>, <a>, <input>, ... gibi belirli bir etiketi ilettiginizde, birden fazla ayni ad
                       etiketine sahip olabileceginiz icin birden cok ogeyi dondurur
                   ***Cogunlukla ogelerin bir listesini almak icin kullanilir Bu nedenle findElements()
                   yontemiyle kullanilmasi onerilir
                   *** ORN: kullandigimiz bir sayfadaki tum linkleri dondurmek icin
                       By.tagName("a") kullanilabilir

         7-) findElement();
                 ----->  WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));
                    *** Driver'in bir elementi bulamasi icin kullaniriz
                    *** Bu, tek bir web elementi dondurur.
                    *** Ayni locator ile ulasilabilen birden fazla web elementi varsa ilkini dondurur
                    *** Driver elementi bulamazsa RTE verir : NoSuchElementException

          8-) findElements();
                 ----> List<WebElement> elementName=driver.findElements(By.LocatorStragety("LocalValue"));
                    *** Locator degerine uygun Web elementlerinin listesini dondurur
                    *** Locator stratejisiyle eslesen web elementi yoksa bos bir liste dondurur
                    *** NoSuchElementException hatasi vermez
                    *** Listedeki her Web elementi, 0'dan baslayan bir indeks alir
         */


}
