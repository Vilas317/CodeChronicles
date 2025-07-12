import { createSlice } from '@reduxjs/toolkit';

const theatreSlice = createSlice({
  name: 'theatres',
  initialState: {
    theatres: [],
  },
  reducers: {
    SetTheatres: (state, action) => {
      state.theatres = action.payload;
    },
  },
});

export const { SetTheatres } = theatreSlice.actions;
export default theatreSlice.reducer;
