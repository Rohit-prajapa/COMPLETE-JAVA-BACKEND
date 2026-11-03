<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // Get email from session
    String email = (String) session.getAttribute("email");

    // Check whether user is logged in
    if (email == null) {
        response.sendRedirect("login.html");
        return;
    }
%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>User Dashboard</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            min-height: 100vh;

            background: linear-gradient(
                135deg,
                #667eea,
                #764ba2
            );
        }

        /* =========================
           NAVBAR
           ========================= */

        .navbar {
            height: 70px;

            background-color: white;

            display: flex;

            justify-content: space-between;

            align-items: center;

            padding: 0 50px;

            box-shadow: 0 3px 10px rgba(0, 0, 0, 0.15);
        }

        .logo {
            font-size: 25px;

            font-weight: bold;

            color: #667eea;
        }

        .user-email {
            color: #555;

            font-size: 14px;
        }


        /* =========================
           MAIN DASHBOARD
           ========================= */

        .main {
            min-height: calc(100vh - 70px);

            display: flex;

            justify-content: center;

            align-items: center;

            padding: 30px;
        }


        .dashboard {
            width: 700px;

            background-color: white;

            padding: 40px;

            border-radius: 15px;

            box-shadow:
                0 15px 40px rgba(0, 0, 0, 0.25);

            text-align: center;
        }


        /* =========================
           WELCOME
           ========================= */

        .icon {
            font-size: 70px;

            margin-bottom: 15px;
        }

        h1 {
            color: #333;

            margin-bottom: 10px;
        }

        .welcome-email {
            color: #667eea;

            font-size: 17px;

            font-weight: bold;

            margin-bottom: 15px;
        }

        .description {
            color: #777;

            margin-bottom: 35px;

            font-size: 15px;
        }


        /* =========================
           CARDS
           ========================= */

        .cards {

            display: grid;

            grid-template-columns:
                repeat(2, 1fr);

            gap: 20px;

            margin-bottom: 30px;
        }


        .card {

            padding: 25px;

            border: 1px solid #eee;

            border-radius: 10px;

            transition: 0.3s;

            background-color: #fafafa;
        }


        .card:hover {

            transform: translateY(-5px);

            box-shadow:
                0 8px 20px rgba(0, 0, 0, 0.12);
        }


        .card-icon {

            font-size: 40px;

            margin-bottom: 12px;
        }


        .card h2 {

            font-size: 20px;

            color: #333;

            margin-bottom: 8px;
        }


        .card p {

            font-size: 14px;

            color: #777;

            margin-bottom: 18px;
        }


        /* =========================
           BUTTONS
           ========================= */

        .btn {

            display: inline-block;

            padding: 10px 22px;

            background-color: #667eea;

            color: white;

            text-decoration: none;

            border-radius: 6px;

            font-size: 14px;

            font-weight: bold;

            transition: 0.3s;
        }


        .btn:hover {

            background-color: #5568d9;
        }


        .logout {

            background-color: #e74c3c;
        }


        .logout:hover {

            background-color: #c0392b;
        }


        /* =========================
           FOOTER
           ========================= */

        .footer {

            margin-top: 20px;

            color: #999;

            font-size: 13px;
        }


        /* =========================
           RESPONSIVE
           ========================= */

        @media (max-width: 600px) {

            .navbar {

                padding: 0 20px;
            }

            .user-email {

                display: none;
            }

            .dashboard {

                width: 100%;

                padding: 25px;
            }

            .cards {

                grid-template-columns: 1fr;
            }
        }

    </style>

</head>


<body>


    <!-- =========================
         NAVBAR
         ========================= -->

    <nav class="navbar">

        <div class="logo">
            Registration App
        </div>

        <div class="user-email">
            Logged in as: <%= email %>
        </div>

    </nav>


    <!-- =========================
         MAIN
         ========================= -->

    <main class="main">

        <div class="dashboard">


            <!-- Welcome Icon -->

            <div class="icon">
                👋
            </div>


            <!-- Welcome Message -->

            <h1>
                Welcome to Your Dashboard
            </h1>


            <div class="welcome-email">

                <%= email %>

            </div>


            <p class="description">

                You have successfully logged into your
                Registration Application.

            </p>


            <!-- =========================
                 DASHBOARD CARDS
                 ========================= -->

            <div class="cards">


                <!-- Profile Card -->

                <div class="card">

                    <div class="card-icon">
                        👤
                    </div>

                    <h2>
                        My Profile
                    </h2>

                    <p>
                        View your registered personal information.
                    </p>

                    <a href="profile" class="btn">
                        View Profile
                    </a>

                </div>


                <!-- Account Card -->

                <div class="card">

                    <div class="card-icon">
                        🔐
                    </div>

                    <h2>
                        Account
                    </h2>

                    <p>
                        Your account is currently active.
                    </p>

                    <a href="profile" class="btn">
                        Account Details
                    </a>

                </div>


            </div>


            <!-- Logout -->

            <a href="logout" class="btn logout">
                Logout
            </a>


            <!-- Footer -->

            <div class="footer">

                Java MVC Registration Application

            </div>


        </div>

    </main>


</body>

</html>