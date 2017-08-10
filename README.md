# demo_0809

Selenium是一个开源的和便携式的自动化软件测试工具，用于测试Web应用程序有能力在不同的浏览器和操作系统运行。Selenium真的不是一个单一的工具，而是一套工具，帮助测试者更有效地基于Web的应用程序的自动化。


Selenium Webdriver
webdriver自动化俗称Selenium 2.0测试Web应用程序工具。 webdriver使用不同的底层框架，Selenium 遥控器使用JavaScript的Selenium 核嵌入式已经在有一定的局限性的浏览器中。 webdriver直接交互而不与Selenium 远程控制，依赖于服务器上的任何中介的浏览器。它是用在以下方面：
在Selenium开发者社区努力下，不断提高Selenium webdriver与Selenium的整合。
MULT浏览器测试，包括对不能很好地支持Selenium的远程控制浏览器改进的功能(硒1.0)
处理多个帧，多个浏览器窗口，弹出窗口和警报。
复杂的页面导航。
高级用户导航，如拖动和拖放。
基于AJAX的UI元素


Selenium测试设计技术
有参与设计测试的各种组件。让我们了解一些参与设计的框架，以及重要的组成部分。点击了解其中的每个都应该可以明白
页面对象模型
  Selenium页面对象模型
  大家都知道，Selenium作用于webelements属性，例如ID，名称，Xpath等与QTP有一个内置的对象库(OR)，Selenium还没有NOT得到一个内置OR。
  因此，我们需要建立或也应该是维护和按需访问。 Page对象模型(POM)是一种流行的设计模式，以创造一种与webelements特性中的每一个都使用一个类文件创建一个对   象库。
  网页中的每一个创建对象和方法被开发专用于访问这些对象。让我们利用http://calculator.net来理解是一样的。
  存在与之关联的各种计算器，并在特定的页面的那些对象中的每一个在一个单独的类文件为静态方法创建，他们都在'测试'class文件中的静态方法将被访问的对象进行访   问。
  见实例：page_objects_perc_calc
使用Excel参数化
  在设计测试，参数化测试是不可避免的。我们会利用Apache的POI- Excel JAR实现是一样的。它可以帮助我们来读取和写入到Excel中。
  Excel文档分为XLS（针对Excel 97-2003）格式和XLSX（针对Excel 2007及以后版本）格式，不同格式所需的JAR包依赖是不一样的。
  a. 下面的依赖仅支持XLS格式：
     <groupId>org.apache.poi</groupId>  
     <artifactId>poi</artifactId>  
     <version>3.11-beta1</version>
  b. 以下依赖既支持XLS格式，也支持XLSX格式：
     <groupId>org.apache.poi</groupId>  
     <artifactId>poi-ooxml</artifactId>  
     <version>3.11-beta1</version>
  见示例：POI floder
log4j日志
异常处理
  当我们正在开发测试中，我们要确保，即使测试失败的脚本可以继续执行。如果最坏的情况都处理不好意外的异常会被抛出。
  如果发生异常，由于无法找到元素，或者预期的结果不与实际值相符，我们应该抓住这个异常并结束测试的逻辑方式，以防脚本本身突然终止。
  如果没有找到(因为任何好的理由)元素，我们应该确保走出的功能顺利。所以，总是需要有try-catch块，如果想要的跟做的是一样的。
  public static WebElement lnk_percent_calc(WebDriver driver)throws Exception
{
  try
  {
    element = driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
    return element;
  }
  catch (Exception e1)
  {
    // Add a message to your Log File to capture the error
      Logger.error("Link is not found.");
    
    // Take a screenshot which will be helpful for analysis.
    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("D:frameworkscreenshots.jpg"));	
    
    throw(e1);
  }
}
多浏览器测试
捕捉屏幕截图
捕获视频
  有时候我们未必能够分析故障只需用日志文件或截图的帮助。有时捕获完整的执行视频帮助。让我们了解如何捕捉视频。
  我们将利用Monte媒体库的执行相同。
  compile group: 'com.github.stephenc.monte', name: 'monte-screen-recorder', version: '0.7.7.0'
  见示例：webdriverdemo.java
  
 Selenium执行操作时高亮对象
   见示例：testHighLigthWebdriver.java
   
   
   
   
   
   
   
   
   
 Everybody is good, now I'm going to demonstrate the GLR test automation project.
Believe that you have some idea of the test automation framework we use,
For these keywords BDD, Cummber, Selenium WebDriver, the Grid is also not strange, you are right, our project is to use them.
This Demo I will not tell their basic knowledge,
but to focus on the design of test system and to use them after my project workflow.

Let's look at some of the frameworks involved in the design, as well as important components.
As everybody knows, the Selenium ACTS on the webelements properties.example id,name,xpath and so on.
we set these elements together to create an object repository,you can create them in a static funtion.

Using Excel parameterized data 
We haven't used it yet,can add it If later need.

Log and report 
We use two kinds of report, extents report and cucumber report,Moments later to show you.


If an exception occurs, unable to find elements, or the expected result is not consistent with the actual value, we should get  this exception, in case the script itself abruptly.
We should ensure that out of function well, so, always need to have a try-catch.

It refers to the selenium grid technology,Achieve the purpose of testing on multiple machines.

We added a screenshot feature when the test failed or ended.


Next, I'd like to run a few test cases for everyone to see.
In execution, in order to clearly see the selenium operation, before implementation I added highlight to elements.
















  
   
   

