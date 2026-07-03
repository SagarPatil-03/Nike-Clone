import React, { useState } from "react";
import { useLocation } from "react-router-dom";

const Order = () => {
  const { state } = useLocation();
  const shoe = state?.shoe;

  const [formData, setFormData] = useState({
    name: "",
    phone: "",
    address: "",
    city: "",
    state: "",
    pincode: "",
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch("http://localhost:5000/api/orders", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          ...formData,
          product: shoe,
        }),
      });

      const data = await response.json();

      alert(data.message);
    } catch (error) {
      alert("Backend is not running.");
    }
  };

  return (
    <div
      style={{
        maxWidth: "700px",
        margin: "40px auto",
        padding: "20px",
      }}
    >
      <h1>Order Details</h1>

      {shoe ? (
        <>
          <img
            src={shoe.image}
            alt={shoe.name}
            style={{
              width: "250px",
              borderRadius: "10px",
            }}
          />

          <h2>{shoe.name}</h2>
          <h3>{shoe.price}</h3>
          <p>{shoe.description}</p>
        </>
      ) : (
        <h2>No Product Selected</h2>
      )}

      <hr />

      <h2>Shipping Address</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="name"
          placeholder="Full Name"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <input
          type="text"
          name="phone"
          placeholder="Mobile Number"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <textarea
          name="address"
          placeholder="Full Address"
          rows="4"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <input
          type="text"
          name="city"
          placeholder="City"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <input
          type="text"
          name="state"
          placeholder="State"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <input
          type="text"
          name="pincode"
          placeholder="Pincode"
          onChange={handleChange}
          required
        />

        <br />
        <br />

        <button type="submit">
          Place Order
        </button>
      </form>
    </div>
  );
};

export default Order;