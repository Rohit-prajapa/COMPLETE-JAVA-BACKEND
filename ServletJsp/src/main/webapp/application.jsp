<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Registration Form</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #667eea, #764ba2);
        }

        .container {
            width: 450px;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.25);
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        .form-group {
            margin-bottom: 16px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
            color: #444;
        }

        input,
        select {
            width: 100%;
            padding: 11px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 15px;
        }

        input:focus,
        select:focus {
            outline: none;
            border-color: #667eea;
        }

        .gender {
            display: flex;
            gap: 20px;
        }

        .gender label {
            font-weight: normal;
            display: flex;
            align-items: center;
            gap: 5px;
        }

        .gender input {
            width: auto;
        }

        .terms {
            display: flex;
            align-items: center;
            gap: 8px;
            margin: 15px 0;
        }

        .terms input {
            width: auto;
        }

        .terms label {
            margin: 0;
            font-weight: normal;
            font-size: 14px;
        }

        .btn {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 6px;
            background-color: #667eea;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #5568d9;
        }

        .login {
            text-align: center;
            margin-top: 18px;
            font-size: 14px;
        }

        .login a {
            color: #667eea;
            text-decoration: none;
            font-weight: bold;
        }

    </style>

</head>

<body>

    <div class="container">

        <h1>Registration Form</h1>

        <form action="register" method="post">

            <!-- Name -->
            <div class="form-group">

                <label for="name">Full Name</label>

                <input type="text"
                       id="name"
                       name="name"
                       placeholder="Enter your full name"
                       required>

            </div>


            <!-- Email -->
            <div class="form-group">

                <label for="email">Email</label>

                <input type="email"
                       id="email"
                       name="email"
                       placeholder="Enter your email"
                       required>

            </div>


            <!-- Password -->
            <div class="form-group">

                <label for="password">Password</label>

                <input type="password"
                       id="password"
                       name="password"
                       placeholder="Enter password"
                       required>

            </div>


            <!-- Confirm Password -->
            <div class="form-group">

                <label for="confirmPassword">Confirm Password</label>

                <input type="password"
                       id="confirmPassword"
                       name="confirmPassword"
                       placeholder="Confirm password"
                       required>

            </div>


            <!-- Mobile -->
            <div class="form-group">

                <label for="mobile">Mobile Number</label>

                <input type="tel"
                       id="mobile"
                       name="mobile"
                       placeholder="Enter 10 digit mobile number"
                       pattern="[0-9]{10}"
                       maxlength="10"
                       required>

            </div>


            <!-- Gender -->
            <div class="form-group">

                <label>Gender</label>

                <div class="gender">

                    <label>
                        <input type="radio"
                               name="gender"
                               value="Male"
                               required>
                        Male
                    </label>

                    <label>
                        <input type="radio"
                               name="gender"
                               value="Female">
                        Female
                    </label>

                    <label>
                        <input type="radio"
                               name="gender"
                               value="Other">
                        Other
                    </label>

                </div>

            </div>


            <!-- DOB -->
            <div class="form-group">

                <label for="dob">Date of Birth</label>

                <input type="date"
                       id="dob"
                       name="dob"
                       required>

            </div>


            <!-- City -->
            <div class="form-group">

                <label for="city">City</label>

                <select id="city"
                        name="city"
                        required>

                    <option value="">-- Select City --</option>

                    <option value="Pune">Pune</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Bangalore">Bangalore</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Chennai">Chennai</option>
                    <option value="Kolkata">Kolkata</option>
                    <option value="Ahmedabad">Ahmedabad</option>

                </select>

            </div>


            <!-- Terms -->
            <div class="terms">

                <input type="checkbox"
                       id="terms"
                       name="terms"
                       required>

                <label for="terms">
                    I agree to Terms & Conditions
                </label>

            </div>


            <!-- Submit -->
            <button type="submit" class="btn">
                Register
            </button>

        </form>


        <!-- Login -->
        <div class="login">

            Already have an account?

            <a href="login.jsp">
                Login
            </a>

        </div>

    </div>

</body>

</html>