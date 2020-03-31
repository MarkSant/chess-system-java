package chessPieces;
import chess.*;
import boardgame.*;

public class King extends ChessPiece
{
		public King (Board board, Color color){
				super(board, color);
		}

		@Override
		public String toString()
		{
				return "K";
		}
		
		
}
