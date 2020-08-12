import java.awt.Color;

public class KernelFilter {

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        return picture;
    }

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture) {
        int[][] a = {
                { 1, 2, 1 },
                { 2, 4, 2 },
                { 1, 2, 1 }
        };
        int k = 16;
        Picture ret = new Picture(picture.width(), picture.height());
        int height = picture.height();
        int width = picture.width();
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = 0, g = 0, b = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int y = (height + row + i) % height;
                        int x = (width + col + j) % width;
                        Color c = picture.get(x, y);
                        r += c.getRed() * a[i + 1][j + 1];
                        g += c.getGreen() * a[i + 1][j + 1];
                        b += c.getBlue() * a[i + 1][j + 1];
                    }
                }
                r = (int) Math.round((double) r / k);
                g = (int) Math.round((double) g / k);
                b = (int) Math.round((double) b / k);
                if (r < 0) r = 0;
                if (r > 255) r = 255;
                if (g < 0) g = 0;
                if (g > 255) g = 255;
                if (b < 0) b = 0;
                if (b > 255) b = 255;
                ret.set(col, row, new Color(r, g, b));
            }
        }
        return ret;
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        int[][] a = {
                { 0, -1, 0 },
                { -1, 5, -1 },
                { 0, -1, 0 }
        };
        Picture ret = new Picture(picture.width(), picture.height());
        int height = picture.height();
        int width = picture.width();
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = 0, g = 0, b = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int y = (height + row + i) % height;
                        int x = (width + col + j) % width;
                        Color c = picture.get(x, y);
                        r += c.getRed() * a[i + 1][j + 1];
                        g += c.getGreen() * a[i + 1][j + 1];
                        b += c.getBlue() * a[i + 1][j + 1];
                    }
                }
                if (r < 0) r = 0;
                if (r > 255) r = 255;
                if (g < 0) g = 0;
                if (g > 255) g = 255;
                if (b < 0) b = 0;
                if (b > 255) b = 255;
                ret.set(col, row, new Color(r, g, b));
            }
        }
        return ret;
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        int[][] a = {
                { -1, -1, -1 },
                { -1, 8, -1 },
                { -1, -1, -1 }
        };
        Picture ret = new Picture(picture.width(), picture.height());
        int height = picture.height();
        int width = picture.width();
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = 0, g = 0, b = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int y = (height + row + i) % height;
                        int x = (width + col + j) % width;
                        Color c = picture.get(x, y);
                        r += c.getRed() * a[i + 1][j + 1];
                        g += c.getGreen() * a[i + 1][j + 1];
                        b += c.getBlue() * a[i + 1][j + 1];
                    }
                }
                if (r < 0) r = 0;
                if (r > 255) r = 255;
                if (g < 0) g = 0;
                if (g > 255) g = 255;
                if (b < 0) b = 0;
                if (b > 255) b = 255;
                ret.set(col, row, new Color(r, g, b));
            }
        }
        return ret;
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        int[][] a = {
                { -2, -1, 0 },
                { -1, 1, 1 },
                { 0, 1, 2 }
        };
        Picture ret = new Picture(picture.width(), picture.height());
        int height = picture.height();
        int width = picture.width();
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = 0, g = 0, b = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int y = (height + row + i) % height;
                        int x = (width + col + j) % width;
                        Color c = picture.get(x, y);
                        r += c.getRed() * a[i + 1][j + 1];
                        g += c.getGreen() * a[i + 1][j + 1];
                        b += c.getBlue() * a[i + 1][j + 1];
                    }
                }
                if (r < 0) r = 0;
                if (r > 255) r = 255;
                if (g < 0) g = 0;
                if (g > 255) g = 255;
                if (b < 0) b = 0;
                if (b > 255) b = 255;
                ret.set(col, row, new Color(r, g, b));
            }
        }
        return ret;
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        int[][] a = new int[9][9];
        for (int i = 0; i < 9; i++)
            a[i][i] = 1;
        int k = 9;
        Picture ret = new Picture(picture.width(), picture.height());
        int height = picture.height();
        int width = picture.width();
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = 0, g = 0, b = 0;
                for (int i = -4; i <= 4; i++) {
                    for (int j = -4; j <= 4; j++) {
                        int y = (height + row + i) % height;
                        int x = (width + col + j) % width;
                        Color c = picture.get(x, y);
                        r += c.getRed() * a[i + 4][j + 4];
                        g += c.getGreen() * a[i + 4][j + 4];
                        b += c.getBlue() * a[i + 4][j + 4];
                    }
                }
                r = (int) Math.round((double) r / k);
                g = (int) Math.round((double) g / k);
                b = (int) Math.round((double) b / k);
                if (r < 0) r = 0;
                if (r > 255) r = 255;
                if (g < 0) g = 0;
                if (g > 255) g = 255;
                if (b < 0) b = 0;
                if (b > 255) b = 255;
                ret.set(col, row, new Color(r, g, b));
            }
        }
        return ret;
    }

    // Test client (ungraded).
    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);
        Picture id = identity(pic);
        Picture gau = gaussian(pic);
        Picture shar = sharpen(pic);
        Picture lap = laplacian(pic);
        Picture emb = emboss(pic);
        Picture mot = motionBlur(pic);
        id.show();
        gau.show();
        shar.show();
        lap.show();
        emb.show();
        mot.show();
    }
}
