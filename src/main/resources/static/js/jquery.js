$('body').on('click', '.password-control', function(){
    if ($('#password_input').attr('type') == 'password'){
        $(this).addClass('view');
        $('#password_input').attr('type', 'text');
    } else {
        $(this).removeClass('view');
        $('#password_input').attr('type', 'password');
    }
    return false;
});