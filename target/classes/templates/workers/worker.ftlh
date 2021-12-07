<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">DataBase</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/worker">Workers</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/delivery">Deliveries</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div>
        <div>
            Список работников
            <form method="get" action="/worker">
                <select name="subsidiaryFilter">
                    <option value="0">Выберите организацию</option>
                    <#list subsidiary as sub>
                            <#if sub.id == subsidiaryFilter>
                                <option value="${sub.id}" selected>${sub.name}</option>
                            <#else>
                                <option value="${sub.id}">${sub.name}</option>
                            </#if>
                    </#list>
                </select>
                <select name="positionFilter">
                    <option value="0">Выберите позицию</option>
                    <#list positions as pos>
                            <#if pos.id == positionFilter>
                                <option value="${pos.id}" selected>${pos.name_position}</option>
                            <#else>
                                <option value="${pos.id}">${pos.name_position}</option>
                            </#if>
                    </#list>
                </select>
                <button type="submit">Найти</button>
            </form>
        </div>
        <table>
            <tr>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>Номер паспорта</th>
                <th>Название филиала</th>
                <th>Должность</th>
                <th>Номер телефона</th>
                <th></th>
                <th><button><a href="/worker/new">Добавить нового работника</a></button></th>

            </tr>

            <#list workers as w>
                <tr>
                    <td>${w.name}</td>
                    <td>${w.surname}</td>
                    <td>${w.w_passport_data}</td>
                    <td>${w.subsidiary.name}</td>
                    <td>${w.positions.name_position}</td>
                    <td>${w.w_phone_number}</td>
                    <th><button type="submit"><a href="/worker/${w.id}/edit">Исправить</a></button></th>
                    <th>
                        <form method="post" action="worker/${w.id}/delete">
                            <button type="submit">Удалить</button>
                        </form>
                    </th>
                </tr>
            </#list>

        </table>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>