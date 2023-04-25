# 📌 MICROSERVICES NOTES 📝📒✏️

## Monolit vs Mikroservis

![img.png](imgs/monolit-vs-micro.png)

### 👍 Monolit arxitekturanın üstünlükləri:
    ✅ Development asandır
    ✅ Deployment asandır
    ✅ Debugging asandır 
    ✅ Kiçik ölçülü proqramları miqyaslaşdırmaq asandır
    ✅ Performans daha yaxşıdır: Monolit arxitektura tək olduğundan, komponentlər arasında əlaqə daha sürətli olur və nəticədə ümumi performans daha yaxşı olur
    ✅ Startuplara başlanğıc seçim üçün yaxşıdır

### 👎  Monolit arxitekturanın mənfi cəhətləri:
    ❌ Development sürəti azalır
    ❌ Deployment sürəti azalır
    ❌ Scalability (Miqyaslılıq) - Fərdi komponentləri miqyaslandırmaq olmur. (Cost çox olur)
    ❌ Reliability (Etibarlılıq) - Hər hansı modulda xəta olarsa, bütün proqrama təsir edir.
    ❌ Yeni texnologiyalara adaptasiya olmamaq

---

### 👍 Mikroservis arxitekturanın üstünlükləri:
    ✅ Çeviklik – Kiçik komanadalar ilə fərqli servislər üzərində çevik işləyib deploy etmək
    ✅ Flexible scaling
    ✅ Davamlı deployment – Tez-tez və daha sürətli deploy olunur. Monolit ilə həftədə bir dəfə yeniləmələri yayımlayırdıqsa indi gündə iki-üç dəfə edə bilərik.
    ✅ Müstəqil deployment
    ✅ Yeni texnologiyalara adaptasiya olmaq
    ✅ Fəqli dillədə development
    ✅ Hər hansı servisdə xəta olarsa, bütün proqrama təsir etmir
    ✅ Xoşbəxt komanda 🎉🎊

### 👎  Mikroservis arxitekturanın mənfi cəhətləri:
    ❌ Servislərin sayı artıqca bir-biri ilə əlaqə qurmaq çətindir
    ❌ Latency - performans zəyifləyir
    ❌ Debugging çətindir
    ❌ Paylanmış sistemlər mürəkkəbdir, bu da development, testing və deploymenti çətinləşdirir
    ❌ Mikroservis arxitekturasının nə vaxt istifadə ediləcəyinə qərar vermək çətindir

## SDLC - Software Development Life Cycle

![img.png](imgs/sdlc.png)
Mənbə: Adil Əliyev

## Git Version Control

![img.png](imgs/git-arch.png)
[Mənbə](https://github.com/pushpankq/Git-Commands-)


![img.png](imgs/git-commands.png)
[Mənbə](https://twitter.com/profulsadangi/status/1311319902049972226/photo/1)

* git commit --amend -> add changes to previous commits
* git commit --amend -m "Commit message" -> add changes and change previous commit
* git revert <commit-id> -> delete the changes and create new commit
* git reset --hard <commit-id> -> delete the changes and commits to commit-id
---

* git branch -> shows all branches
* git branch develop -> create new branch
* git checkout develop -> switch to develop branch
* git checkout -b new-branch -> create new branch and switch to the branch
* git branch -d new-branch -> delete new branch

---

* git stash -> stores all changes in workspace and does not commit
* git stash list -> see all stash lists
* git stash clear -> delete the stash list and doesn't appear in workspace
* git stash pop -> come back to the last stashed changes and delete from stash list
* git stash apply <stash-id> -> come back to the last stashed changes and doesn't delete from stash list

---

* git merge <branch-name> -> merge branch to HEAD branch
* git merge --squash <branch-name> -> merge branch to HEAD branch, and then you should write commit message (git commit -m "message")
* git merge --abort -> abort conflict merge
* git rebase -> merge branch to HEAD branch and keep git history clean
* Note: merge create comment but rebase doesn't create comment


---
Useful commands

* watch --color -n 2 "git log --graph --format=format:'%C(bold blue)%h%C(reset) - %C(bold green)(%ar)%C(reset) %C(white)%an%C(reset)%C(bold yellow)%d%C(reset) %C(dim white)- %s%C(reset)' --all"



🎥 Videos
* [Git From the Bits Up](https://www.youtube.com/watch?v=MYP56QJpDr4&ab_channel=InfoQ)
📝 Articles
* [Merging vs. Rebasing](https://www.atlassian.com/git/tutorials/merging-vs-rebasing#the-golden-rule-of-rebasing)
* [Best Practices for Your Git Branches](https://medium.com/git-happy/10-key-best-practices-for-git-branch-management-b0e7ec4148b9)
* [A Visual Git Reference](https://marklodato.github.io/visual-git-guide/index-en.html)
* 


---

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
    


### Structural
### Behavior

---
## Spring Boot Foundation

