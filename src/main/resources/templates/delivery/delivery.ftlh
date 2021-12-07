<!DOCTYPE html>
<html lang="en">
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
        Список поставок
        <button><a href="/delivery/new">Добавить новую поставку</a></button>
        <button><a href="/supplier">Список поставщиков</a></button>
    </div>
    <table>
        <tr>
            <th>Название товара</th>
            <th>Количество</th>
            <th>Цена покупки</th>
            <th>Поставщик</th>
            <th></th>
        </tr>
        <#list deliveries as deliver>
            <tr>
                <td>${deliver.productName.name_product}</td>
                <td>${deliver.quantity}</td>
                <td>${deliver.price} руб.</td>
                <td>${deliver.suppliers.name_supplier}</td>
                <td><button type="submit"><a href="/delivery/${deliver.id}/edit">Редактировать</a></button></td>
                <td>
                    <form method="post" action="delivery/${deliver.id}/delete">
                        <button type="submit">Удалить</button>
                    </form>
                </td>
            </tr>
        </#list>

    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</body>
</html>