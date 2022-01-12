function plusMinus(a) {
    let x = parseInt(document.getElementById("soVeXe").value);
    if ((parseInt(a) < 0 && x > 0) || (parseInt(a) > 0)) {
        document.getElementById("soVeXe").value = x + a;
    }
    countPrice();
}
function countPrice() {
    let soLuong = document.getElementById("soVeXe").value;
    let P = parseFloat(document.getElementById("vehical_price").value);
    if (soLuong > 0) {
        document.getElementById("vehical_next").removeAttribute('disabled');
    } else {
        document.getElementById("vehical_next").setAttribute('disabled', true);
    }
    document.getElementById("all_vehical_price").innerHTML = soLuong * P + " VND ";
}