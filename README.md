# JavaLearningWithLena

Текущие задания находятся в <a href = "https://vk.com/away.php?to=https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1-TPSv69dhbwm1DeoDl9BjJHTgR51jenevuqlaKNUzoc%2Fedit%3Fusp%3Dsharing&cc_key=">Google Docs</a>.

1) Первым делом нужно склонировать проект с помощью команды git clone:

$> git clone https://github.com/lipatkin96/JavaLearningWithLena.git

2) Добавить файлы в индекс, чтобы git "увидел" изменения в твоём локальном репозитории:

$> git add -A

3) Сделать "снимок" репозитория, чтобы сохранить текущий прогресс - внесённые тобой изменения в проект:

$> git commit -m "Здесь я пишу то, что сделала."

4) Перед тем, как "запостить" сделанные тобой коммиты, нужно проверить, а не изменял ли кто твой глобальный репозиторий - который хранится на сайте github.com. Для этого мы отправляем запрос с требованием подгрузить данные с глобального репозитория:

$> git pull
// Тут может быть два варианта:
// 1)
Already up to date.
// Означает, что локальный репозиторий совпадает с глобальным. 
// Что он обновлён до последней версии и никаких изменений ожидать не нужно.

// 2)
remote: Enumerating objects: 43, done.                  // слово "done." в конце оч хорошее - означает, что действие выполнено
remote: Counting objects: 100% (42/42), done.
remote: Compressing objects: 100% (14/14), done.
remote: Total 28 (delta 10), reused 28 (delta 10), pack-reused 0
Unpacking objects: 100% (28/28), 3.75 KiB | 5.00 KiB/s, done.     // процесс распаковки загруженных данных
From https://github.com/lipatkin96/JavaLearningWithLena           // адрес репозитория, с которого подгружаются данные
   8484cd7..64172c6  master     -> origin/master
Updating 8484cd7..64172c6                                         // обновляются коммиты
Fast-forward                                                      // начинается процесс "слияния" или merge.
 Exercises/Task #4/src/NOD.java  | 28 ++++++++++++++++------------
 Exercises/Task #4/src/NOD2.java | 33 ++++++++++++++++++++-------------
 2 files changed, 36 insertions(+), 25 deletions(-)

// Мы не встретили ниодного слова CONFLICT - значит процесс слияния прошёл без помех. Ура!

// 3)
(CONFLICT) ....
// Пишим Артемону!!

5) Как только мы слились с глобальным репозиторием или удостоверились, что все изменения подгружены, можем смело наши изменения постить в глобальный репозиторий:

$> git push
