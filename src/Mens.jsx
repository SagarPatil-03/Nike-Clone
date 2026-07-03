import image from "./assets/images.jpg";
import imag from "./assets/images (1).jpg";
import im from "./assets/images (2).jpg";
import s from "./assets/Nike_Victori_One_Men's_Slides.jpg";
import b from "./assets/images (3).jpg";
import "./mens.scss";

import { useNavigate } from "react-router-dom";

const Mens = () => {
  const navigate = useNavigate();

  return (
    <div className="Ui">
      <marquee>Welcome Nike Men's Collection</marquee>

      <div className="im">
        <p>Men's Shoes</p>
        <img src={image} alt="Men's Shoes" />
        <button onClick={() => navigate("/mv1")}>Visit Us</button>

        <p>Men's Hoodie</p>
        <img src={imag} alt="Men's Hoodie" />
        <button>Visit Us</button>

        <p>Men's Bottle</p>
        <img src={im} alt="Men's Bottle" />
        <button>Visit Us</button>

        <p>Men's Slippers</p>
        <img src={s} alt="Men's Slippers" />
        <button>Visit Us</button>

        <p>Men's Bags</p>
        <img src={b} alt="Men's Bags" />
        <button>Visit Us</button>

        <button className="h" onClick={() => navigate("/")}>
          Home
        </button>
      </div>
    </div>
  );
};

export default Mens;