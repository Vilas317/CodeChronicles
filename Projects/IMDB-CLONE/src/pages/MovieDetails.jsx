// import { useParams } from 'react-router-dom';

// function MovieDetails() {
//   const { id } = useParams();

//   return (
//     <div>
//       <h2 className="text-xl font-semibold">Movie Details</h2>
//       <p className="mt-4">You're viewing details for movie ID: {id}</p>
//     </div>
//   );
// }

// export default MovieDetails;

import { useParams } from "react-router-dom";

function MovieDetails() {
  const { id } = useParams();
  return <h1>Details of Movie ID: {id}</h1>;
}
export default MovieDetails;
