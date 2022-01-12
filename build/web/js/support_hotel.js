function plusMinus(a) {
    let x = parseInt(document.getElementById("soLuongPhong").value);
    if ((parseInt(a) < 0 && x > 0) || (parseInt(a) > 0)) {
        document.getElementById("soLuongPhong").value = x + a;
    }
    countPrice();
}
function countPrice() {
    let soLuong = document.getElementById("soLuongPhong").value;
    let P = parseFloat(document.getElementById("room_price").value);
    if (soLuong > 0) {
        document.getElementById("hotel_next").removeAttribute('disabled');
    } else {
        document.getElementById("hotel_next").setAttribute('disabled', true);
    }
    document.getElementById("all_price").innerHTML = soLuong * P + " VND ";
}