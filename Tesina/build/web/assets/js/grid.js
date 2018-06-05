$(function () {
    $('#worked .add-row').click(function () {
        var template = '<tr><td><input class="form-control" type="text"></td><td><input class="form-control" type="text"></td><td><input class="form-control" type="text"></td><td><input class="form-control" type="text"></td><td><button type="button" class="btn btn-danger delete-row">-</button></td></tr>';
        $('#worked tbody').append(template);
    });

    $('#worked').on('click', '.delete-row', function () {
        $(this).parent().parent().remove();
    });
})