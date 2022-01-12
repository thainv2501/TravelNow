<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>TravelNow</title>
    <link rel="stylesheet" href="css/customer.css" />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
      integrity="sha512-SfTiTlX6kk+qitfevl/7LibUOeJWlt9rbyDn92a1DqWOw9vWG2MFoays0sgObmWazO5BQPiFucnnEAjpAB+/Sw=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <script src="/js/support.js"></script>
  </head>
  <body>
  <jsp:include page="menu.jsp"></jsp:include>

    <div class="detail">
      <h1>Finish Order</h1>
      <div class="card-detail">

        <div class="detail-right">
          <div class="detail-right-top">
            <h2>Fill Your Information</h2>
          </div>
          <div class="detail-right-content">
              <form action="customerInfor" method="post">
                  
                  <table>
                    <tr>
                      <th>CMND :</th>
                      <td><input type="text" name="customerId" required></td>
                    </tr>
                    <tr>
                      <th>Full Name : </th>
                      <td><input type="text" name="cusName" required></td>
                    </tr>
                    <tr>
                      <th>Address</th>
                      <td>
                        
                        <input type="text" name="address" required />
                      </td>
                    </tr>
                    <tr>
                      <th>Phone : </th>
                      <td><input type="number" name="phone" required></td>
                    </tr>
              
                  </table>
                  
                  <div class="detail-bottom">           
                      <button
                      class="item login"
                      id="next"
                      type="submit"
                      >
                      Next
                    </button>
                </div>
                  </form>
            </div>
            
        </div>
      </div>
    </div>
  </body>
</html>
