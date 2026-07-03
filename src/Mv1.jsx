import React from "react";
import { useNavigate } from "react-router-dom";

import shoe1 from "./assets/Mvs1.jpg";
import shoe2 from "./assets/Mvs2.jpg";
import shoe3 from "./assets/Mvs3.jpg";

import "./Mv1.scss";

const Mv1 = () => {
  const navigate = useNavigate();

  const shoes = [
    {
      id: 1,
      name: "Nike Air Max 270",
      price: "₹11,995",
      image: shoe1,
      description:
        "Lightweight running shoe with breathable mesh upper and Max Air cushioning.",
    },
    {
      id: 2,
      name: "Nike Air Force 1",
      price: "₹7,495",
      image: shoe2,
      description:
        "Classic everyday sneaker with premium leather upper and durable rubber outsole.",
    },
    {
      id: 3,
      name: "Nike Revolution 7",
      price: "₹4,995",
      image: shoe3,
      description:
        "Comfortable running shoe with soft foam cushioning and lightweight design.",
    },
  ];

  const orderNow = (shoe) => {
    navigate("/order", {
      state: { shoe },
    });
  };

  return (
    <div className="container">
      {shoes.map((shoe) => (
        <div className="card" key={shoe.id}>
          <img src={shoe.image} alt={shoe.name} />

          <h2>{shoe.name}</h2>

          <h3>{shoe.price}</h3>

          <p>{shoe.description}</p>

          <button onClick={() => orderNow(shoe)}>
            Order Now
          </button>

          <hr />
        </div>
      ))}
    </div>
  );
};

export default Mv1;