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
log4j日志
异常处理
多浏览器测试
捕捉屏幕截图
捕获视频

