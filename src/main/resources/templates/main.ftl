<html>

<body>
    <div>
        <form method="post">
            <input type="text" name="text" placeholder="Введите сообщение" />
            <input type="text" name="tag" placeholder="Тэг">
            <button type="submit">Добавить</button>
        </form>
    </div>
    <div>Список сообщений</div>
    <form method="post" action="filter">
        <input type="text" name="filter" placeholder="Введите тэг для поиска">
        <button type="submit">Найти</button>
    </form>
    {{#messages}}
        <div>


            <i>{{tag}}</i>
        </div>
    {{/messages}}
</body>
</html>