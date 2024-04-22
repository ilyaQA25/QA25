1. Обновить версии всех библиотек в проекте и 
ее вывод:

mvn versions:display-dependency-updates

  a)  The following dependencies in Dependencies have newer versions:
  [INFO]   io.github.bonigarcia:webdrivermanager ................. 5.7.0 -> 5.8.0
  [INFO]   org.seleniumhq.selenium:selenium-java ............... 4.18.1 -> 4.19.1



mvn versions:use-latest-versions

б) The following dependencies in Dependencies have newer versions:
   [INFO]   io.github.bonigarcia:webdrivermanager ................. 5.7.0 -> 5.8.0
   [INFO]   org.seleniumhq.selenium:selenium-java ............... 4.18.1 -> 4.19.1

2. Запустить тесты используя mvn clean test команду и ее вывод

mvn clean -DlockedUserName=OpenInventoryPage test

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 8.986 s -- in TestSuite

Results:
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0


3. Использовать параметры для запуска конкретных тестов и методов

mvn clean -Dtest=OpenInventoryPage#openInventoryPage+chooseGoods test

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.71 s -- in tests.OpenInventoryPage

Results:
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

4. Пробросить параметр из mvn command line внутрь теста

mvn clean -DsuiteFileName=parallel2.xml -Dtest=MavenTest test

parallel2.xml
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.301 s -- in tests.MavenTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

