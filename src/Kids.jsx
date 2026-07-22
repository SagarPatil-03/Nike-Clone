import React from 'react';
import kish from "./assets/kshoe.jpg";
import k from "./assets/kslip.jpg";
import ki from "./assets/kidsbag.jpg";
import kc from "./assets/kiclo.jpg";

const Kids = () => {
  return (
    <div>
      <marquee>Welcome Kids Collection...Try Once</marquee>
      <p>Kid's Shoes</p>
      <img src={kish} alt="Kid's Shoes" />
      <button>Visit Us</button>

      <p>Kid's Slippers</p>
      <img src={k} alt="Kid's Slippers" />
      <button>Visit Us</button>

      <p>Kid's Bags</p>
      <img src={ki} alt="Kid's Bags" />
      <button>Visit Us</button>

      <p>Kid's Clothes</p>
      <img src={kc} alt="Kid's Clothes" />
      <button>Visit Us</button>
    </div>
  );
};

export default Kids;
