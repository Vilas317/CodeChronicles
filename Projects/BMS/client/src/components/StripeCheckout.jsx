import React from "react";
import StripeCheckout from "react-stripe-checkout";
import axios from "axios";

function StripeCheckoutButton({ amount }) {
  const handleToken = async (token) => {
    try {
      const response = await axios.post("/api/payments/create-checkout-session", {
        token,
        amount,
      });

      if (response.data.success) {
        window.location.href = "/payment-success";
      }
    } catch (error) {
      console.error("Payment Error:", error);
    }
  };

  return (
    <StripeCheckout
      token={handleToken}
      stripeKey="your_publishable_key_here"
      amount={amount * 100} // amount in cents
      name="BookMyShow"
      billingAddress
      shippingAddress
    />
  );
}

export default StripeCheckoutButton;
