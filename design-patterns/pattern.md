## Design patterns

### Creation
* Singleton
    * Bir sinifin yanlız bir obyekti yaranır
    * Java core kitabxanasında singleton nümunələri:
        * java.lang.Runtime#getRuntime()
        * java.awt.Desktop#getDesktop()
        * java.lang.System#getSecurityManager()
    * Use cases:
        * Resource management (database connection or a file handle)
        * Configuration settings
        * Logging
        * Cache management
        * Utility classes
    * Drawbacks:
        * Singleton qırılsa bütün proyektə təsir edəcək
        * Global state (difficult to maintain and test)
        * Difficult to test
        * Can introduce concurrency issues
    * [Code](design-patterns/src/creation/singleton)

* Builder
    * Çoxlu konstrukturun qarşısını alır
    * [Code](design-patterns/src/creation/builders)

* Factory
    * SOLID (Open/Closed prinsipi)
    *

* Abstract Factory
    * Factory of factory

* Prototype

---

### Structural  (classların strukturunun bir-biri ilə əlaqəsi)

* Adapter
    * 3-rd party və business core-a qoşulmaq üçün istifadə olunur
    * istifadə etməsək inteqrasiyanı yazdığımız ms-lərdə məntiqi təkrarlanacaq
    *

* Bridge
    * iki sistem arasında ortaq nöqtə yaradırıq ki onları birləşdirib rahat istifadə edək
    * Məsələn Developer iki app yaratmaq istəyir burda biz interface vasitəsi ortaq komponentlərini implement edə bilirik
    * Hansısa ortaq komponentlərə ehiyac varsa abstration yaradıb bridge patterni istifadə etməklə rahat implement edə bilirik
    * coverts from interface to composition
    * Application (fb, ln) -> PhoneOS (android, iphone) -> App::run -> runs apps in phones
    * [Code](design-patterns/src/structural/bridge)

* Facade
    * Adapter kimidir amma məntiq yazılır
    * İnteqeasiya deyil sadəcə complex bir ms varsa onu handle etmək üçün istifadə etmək olar

* Proxy
    * Təhlükəsizlik üçüm əsasən istifadə olunur
    * Datanı proxydə saxlayib sonra istifadə etdir
    * Client -> Proxy -> Database
    * @Transaction and @Async nümunə
    * Clients -> cache (Disk proxy) -> disk

* Composite
* Decorator
* Flyweight

### Behavior  (classların funksyonallıqların bir-biri ilə əlaqəsi)

* Iterator

* Strategy
    * Eyniməntiqli və funksyonallığı (alqoritmi) fərqli olan üçün bir abstraction qurulur və funksyonallıq ayrı-ayrı handle olunur
    * NotificationProvider -> SmsProvider, MailProvider, TelegramProvider
    * Proqramın strukturunu dəyişmədən yeni funksyonallıq əlavə etmək olar
    * Collection.sort()

* Chain of responsibility
    * Priority məntiqi harda varsa orda istifadə olunur
    * Bir-birindən ayrı komponentlərin priorityə görə ardıcıl görülməsi


* Observer
    * PUB - SUB 